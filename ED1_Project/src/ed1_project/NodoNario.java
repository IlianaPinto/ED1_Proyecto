
package ed1_project;

import java.util.ArrayList;

public class NodoNario {
    private String dato;
    private ArrayList<NodoNario> hijos;
    private double porcentaje;

    public NodoNario(String dato) {
        this.dato = dato;
        hijos = new ArrayList();
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public ArrayList<NodoNario> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<NodoNario> hijos) {
        this.hijos = hijos;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Nombre: " + dato+ ", Porcentaje: "+porcentaje;
    }
    
    
    
    
}
