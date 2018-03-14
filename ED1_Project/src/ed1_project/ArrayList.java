package ed1_project;


public class ArrayList implements ListaInterface{
    Object[] lista;
    int AvailPos;
    int size;
    int length;

    public ArrayList() {
    }

    public ArrayList(int size) {
        this.size = size;
        lista = new Object[size];
        AvailPos = 0;
        length = 0;
    }

    @Override
    public boolean insert(int pos, Object data) {
        if (pos >= 0 && pos <= AvailPos){
            if (pos == AvailPos) {
                lista[pos] = data;
                AvailPos++;
                length++;
                
            }else{
                for (int i = AvailPos; i >= pos; i--) {
                    lista[i] = lista[i-1];
                }
                AvailPos++;
                lista[pos] = data;
            }
            return true;
        }else{
            return false;
        }
    }
    
    

    @Override
    public int find(Object data) {
        for (int i = 0; i < AvailPos; i++) {
            if (lista[i] == data) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object get(int pos) {
        if (pos >= 0 && pos < AvailPos) {
            return lista[pos];
        }else{
            return null;
        }
    }

    @Override
    public boolean delete(int pos) {
        if (pos >= 0 && pos < AvailPos) {
            for (int i = pos; i < AvailPos; i++) {
                lista[i] = lista[i+1];
            }
            AvailPos--;
            lista[AvailPos] = null;
            length--;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void clear() {
        lista = new Object[size];
        AvailPos = 0;
        length = 0;
    }

    @Override
    public Object first() {
        return lista[0];
    }

    @Override
    public void print() {
        for (int i = 0; i < AvailPos; i++) {
            System.out.print("["+lista[i]+"] ");
        }
        System.out.println();
    }

    @Override
    public Object next(int pos) {
        return get(pos+1);
    }

    @Override
    public boolean insert(Object data) {
        lista[AvailPos] = data;
        AvailPos++;
        length++;
        return true;
    }

    @Override
    public boolean set(int pos, Object data) {
        lista[pos] = data;
        return true;
    }
}
