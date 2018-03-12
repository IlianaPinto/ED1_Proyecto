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
public class Queue implements QueueInterface {

    public Object[] array;
    public int cap;
    public int size;
    public int s, f;

    public Queue() {
    }

    public Queue(int cap) {
        this.cap = cap;
        s = f = 0;
        array = new Object[cap];
        size = 0;
    }

    @Override
    public boolean Queue(Object data) {
        if (size < cap) {
            array[f] = data;
            f++;
            size++;
            if (f >= cap) {
                f = 0;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object deQueue() {
        if (isEmpty() != true) {
            Object temp = array[s];
            array[s] = null;
            size--;
            s++;
            if (s >= cap) {
                s = 0;
            }
            return temp;
        } else {
            return null;
        }
    }

    @Override
    public Object Front() {
        if (isEmpty()) {
            return null;
        } else {
            return array[s];
        }
    }

    @Override
    public void Clear() {
        array = new Object[cap];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void Print() {
        int conts = s;
        for (int i = 0; i < cap; i++) {
            if (conts < cap) {
                if (array[conts] != null) {
                    System.out.print("[" + array[conts] + "]");
                    conts++;
                }else{
                    conts++;
                }
            } else {
                conts = 0;
            }
        }
        System.out.println();
    }

}
