
package ed1_project;

public class StackEx implements StackExpansionInter{
    public NodoDij[] array;
    public int size;
    public int cap;

    public StackEx(int cap) {
        this.cap = cap;
        array = new NodoDij[cap];
        size = 0;
    }
 
    @Override
    public void clear() {
        array = new NodoDij[cap];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean push(NodoDij data) {
        if (size < cap) {
            array[size] = data;
            size++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public NodoDij Pop() {
        if (size > 0) {
            size--;
            NodoDij temp = array[size];
            array[size] = null;
            return temp;
        }else{
            return null;
        }
    }

    @Override
    public NodoDij Top() {
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
