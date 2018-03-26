
package ed1_project;

import java.util.ArrayList;

public class NodoDij {
    private ArrayList<Arista> arista;
    private int nombre;
    private boolean visitado;

    public NodoDij(int nombre) {
        this.nombre = nombre;
        visitado = false;
        arista = new ArrayList();
    }

    public ArrayList<Arista> getArista() {
        return arista;
    }

    public void setArista(ArrayList<Arista> arista) {
        this.arista = arista;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    
    
    
}
