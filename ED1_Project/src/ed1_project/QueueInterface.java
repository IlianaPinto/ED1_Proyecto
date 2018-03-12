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
public interface QueueInterface {
    public boolean Queue(Object data);
    public Object deQueue(); 
    public Object Front();
    public void Clear();
    public boolean isEmpty();
    public void Print();
}
