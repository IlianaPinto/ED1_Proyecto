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
public class ArrayStack implements StackInterface{
    public Object[] array;
    public int size;
    public int cap;

    public ArrayStack() {
    }

    public ArrayStack(int cap) {
        this.cap = cap;
        array = new Object[cap];
        size = 0;
    }

    @Override
    public void clear() {
        array = new Object[cap];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean push(Object data) {
        if (size < cap) {
            array[size] = data;
            size++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object Pop() {
        if (size > 0) {
            size--;
            Object temp = array[size];
            array[size] = null;
            return temp;
        }else{
            return null;
        }
    }

    @Override
    public Object Top() {
        if (size > 0) {
            return array[size-1];
        } else {
            return null;
        }
    }

    @Override
    public void Print() {
        for (int i = 0; i < size; i++) {
            System.out.println("["+array[i]+"] ");
        }
    }
}
