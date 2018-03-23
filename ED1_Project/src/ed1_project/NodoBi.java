
package ed1_project;

import java.awt.Color;

public class NodoBi {
    private List aristas;
    private int nombre;
    private Color color;
    private boolean visitado;

    public NodoBi(int nombre) {
        //this.aristas = aristas;
        aristas = new List(200);
        this.nombre = nombre;
        this.color = Color.white;
        visitado = false;
    }

    public Color getColor() {
        return color;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

    public List getAristas() {
        return aristas;
    }

    public void setAristas(List aristas) {
        this.aristas = aristas;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return aristas +"";
    }
    
    
}
