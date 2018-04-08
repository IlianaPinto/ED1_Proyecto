package ed1_project;

import javax.swing.JOptionPane;

public class Nario {

    private NodoNario root;
    private int cont = 0;
    private double acum = 0;

    public Nario(String dato) {
        root = new NodoNario(dato);
    }

    public NodoNario getRoot() {
        return root;
    }

    public void setRoot(NodoNario root) {
        this.root = root;
    }

    public void Insertar(NodoNario node, String dato, String papasito) {
        NodoNario nueva = new NodoNario(dato);
        if (node.getDato().equals(papasito)) {
            node.getHijos().add(nueva);
        } else {
            for (int i = 0; i < node.getHijos().size(); i++) {
                if (node.getHijos().get(i).getDato().equals(papasito)) {
                    node.getHijos().get(i).getHijos().add(nueva);
                } else {
                    Insertar(node.getHijos().get(i), dato, papasito);
                }
            }
        }
    }

    public void imprimir(NodoNario node) {
        for (int i = 0; i < node.getHijos().size(); i++) {
            System.out.println(node.getHijos().get(i));
            imprimir(node.getHijos().get(i));
        }
    }

    public void calificar(NodoNario node) {
        try {
            if (node.getHijos().isEmpty()) {
                double num = Double.parseDouble(JOptionPane.showInputDialog("Calificacion de empleado " + node.getDato()));
                while (num < 0 || num > 100) {
                    num = Double.parseDouble(JOptionPane.showInputDialog("Calificacion de empleado " + node.getDato() + " invalida "));
                }
                node.setPorcentaje(num);
            } else {
                for (int i = 0; i < node.getHijos().size(); i++) {
                    calificar(node.getHijos().get(i));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
    }

    public void promedio(NodoNario node) {
        for (int i = 0; i < node.getHijos().size(); i++) {
            if (node.getHijos().get(i).getPorcentaje() != 0) {
                acum += node.getHijos().get(i).getPorcentaje();
                cont++;
            }
            if (i == node.getHijos().size() - 1) {
                double calculo = acum / cont;
                acum = 0;
                cont = 0;
                node.setPorcentaje(calculo);
            }
            promedio(node.getHijos().get(i));
        }
    }
}
