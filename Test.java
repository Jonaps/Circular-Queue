
package com.mycompany.test;

public class Test {

    public static void main(String[] args) {
        CircularQueue<String> q = new CircQueue<>();
        q.enqueue("Subham");
        q.enqueue("Jonathan");
        q.enqueue("Subha");
        q.enqueue("Aniket");
        q.rotate();
        while(!(q.isEmpty())) {
            System.out.println(q.dequeue());
        }
    }
}
