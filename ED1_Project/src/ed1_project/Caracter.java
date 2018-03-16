
package ed1_project;

public class Caracter {
   private char caracter;
   private int numero;

    public Caracter(char caracter,int numero) {
        this.caracter = caracter;
        this.numero = numero;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Caracter{" + "caracter=" + caracter + ", numero=" + numero + '}';
    }
   
   
}
