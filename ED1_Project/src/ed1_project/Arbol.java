
package ed1_project;

public class Arbol {
    private Nodo raiz;

    public Arbol(Object data) {
        this.raiz = new Nodo(data); 
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    
    
}
