
package ed1_project;

public class Caracter {
   private char caracter;
   private int numero;
   private String code;

    public Caracter(char caracter,int numero) {
        this.caracter = caracter;
        this.numero = numero;
        code = "";
    }

    public Caracter(char caracter, String code) {
        this.caracter = caracter;
        this.code = code;
        numero = 0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
