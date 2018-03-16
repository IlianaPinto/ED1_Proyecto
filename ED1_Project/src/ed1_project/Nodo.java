
package ed1_project;

public class Nodo {
    private Caracter data;
    private Nodo padre;
    private Nodo hojaI;
    private Nodo holaD;

    public Nodo(Caracter data) {
        this.data = data;
    }

    public Caracter getData() {
        return data;
    }

    public void setData(Caracter data) {
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
