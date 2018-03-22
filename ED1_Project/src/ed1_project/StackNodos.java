
package ed1_project;

public class StackNodos implements StackNodosInterface{
    public NodoBi[] array;
    public int size;
    public int cap;

    public StackNodos(int cap) {
        this.cap = cap;
        array = new NodoBi[cap];
        size = 0;
    }
    
    
    @Override
    public void clear() {
        array = new NodoBi[cap];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean push(NodoBi data) {
        if (size < cap) {
            array[size] = data;
            size++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public NodoBi Pop() {
        if (size > 0) {
            size--;
            NodoBi temp = array[size];
            array[size] = null;
            return temp;
        }else{
            return null;
        }
    }

    @Override
    public NodoBi Top() {
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
