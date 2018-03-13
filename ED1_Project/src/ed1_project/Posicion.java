
package ed1_project;

public class Posicion {
    private int posicioni;
    private int posicionj;
    private String caracter;

    public Posicion(int posicioni, int posicionj, String caracter) {
        this.posicioni = posicioni;
        this.posicionj = posicionj;
        this.caracter = caracter;
    }

    public int getPosicioni() {
        return posicioni;
    }

    public void setPosicioni(int posicionx) {
        this.posicioni = posicionx;
    }

    public int getPosicionj() {
        return posicionj;
    }

    public void setPosicionj(int posiciony) {
        this.posicionj = posiciony;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    @Override
    public String toString() {
        return "Posicion{" + "i=" + posicioni + ", j=" + posicionj + '}';
    }
    
    
           
}
