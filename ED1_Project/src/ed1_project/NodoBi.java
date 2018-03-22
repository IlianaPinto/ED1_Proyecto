
package ed1_project;

public class NodoBi {
    private List aristas;
    private int nombre;

    public NodoBi(int nombre) {
        //this.aristas = aristas;
        aristas = new List(200);
        this.nombre = nombre;
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
    
    
}
