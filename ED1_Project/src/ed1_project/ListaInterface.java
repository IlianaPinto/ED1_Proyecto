
package ed1_project;

public interface ListaInterface {
    public boolean insert(int pos,Object data);
    public int find(Object data);
    public Object get(int pos);
    public boolean delete(int pos);
    public void clear();
    public Object first();
    public void print();
    public Object next(int pos);
    public boolean insert(Object data); 
    public boolean set(int pos, Object data);
    public boolean isEmpty();
}
