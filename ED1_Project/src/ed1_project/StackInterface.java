/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed1_project;

/**
 *
 * @author HP
 */
public interface StackInterface {
    public void clear();
    public boolean isEmpty();
    public boolean push(Posicion data);
    public Posicion Pop();
    public Posicion Top();
    public void Print();
}
