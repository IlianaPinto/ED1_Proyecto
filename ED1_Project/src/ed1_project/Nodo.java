
package ed1_project;

public class Nodo {
    private Object data;
    private Nodo padre;
    private Nodo hojaI;
    private Nodo holaD;

    public Nodo(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getHojaI() {
        return hojaI;
    }

    public void setHojaI(Nodo hojaI) {
        this.hojaI = hojaI;
    }

    public Nodo getHolaD() {
        return holaD;
    }

    public void setHolaD(Nodo holaD) {
        this.holaD = holaD;
    }
    
    
}
