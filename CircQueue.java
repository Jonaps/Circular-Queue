
package com.mycompany.test;


public class CircQueue<E> extends LinkedQueue<E> implements CircularQueue<E>  {

    @Override
    public void rotate() {
        this.enqueue(dequeue());
    }
    
}
