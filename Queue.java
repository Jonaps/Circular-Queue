
package com.mycompany.test;


public interface Queue<E> {
    
    public void enqueue(E e);
    
    public E dequeue();
    
    public E first();
    
    public int size();
    
    public boolean isEmpty();
    
}
