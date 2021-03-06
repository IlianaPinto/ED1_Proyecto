
package ed1_project;

public class ArrayStack implements StackInterface{
    public Posicion[] array;
    public int size;
    public int cap;

    public ArrayStack() {
    }

    public ArrayStack(int cap) {
        this.cap = cap;
        array = new Posicion[cap];
        size = 0;
    }

    @Override
    public void clear() {
        array = new Posicion[cap];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean push(Posicion data) {
        if (size < cap) {
            array[size] = data;
            size++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Posicion Pop() {
        if (size > 0) {
            size--;
            Posicion temp = array[size];
            array[size] = null;
            return temp;
        }else{
            return null;
        }
    }

    @Override
    public Posicion Top() {
        if (size > 0) {
            return array[size-1];
        } else {
            return null;
        }
    }

    @Override
    public void Print() {
        for (int i = 0; i < size; i++) {
            System.out.println("["+array[i].toString()+"] ");
        }
    }
}
