package queue;

import node.Node;

public class PriorityQueueMain {
    public static void main(String[] args) {
        Node n1 = new Node(10, 5);
        Node n2 = new Node(20, 3);
        Node n3 = new Node(30, 1);
        PriorityQueue obj = new PriorityQueue();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        Node display = obj.dequeue();
        System.out.println("Your Deleted Node -- " + display);
    }
}
