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
public interface ListaInterface {
    public boolean insert(int pos,Object data);
    public int find(Object data);
    public Object get(int pos);
    public boolean delete(int pos);
    public void clear();
    public Object first();
    public void print();
    public Object next(int pos);
}
