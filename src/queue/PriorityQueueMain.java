package queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        PriorityQueue.Node n1 = new PriorityQueue.Node(10, 5);
        PriorityQueue.Node n2 = new PriorityQueue.Node(20, 3);
        PriorityQueue.Node n3 = new PriorityQueue.Node(30, 1);
        PriorityQueue.Node.PriorityQueueWithLinkedList obj = new PriorityQueue.Node.PriorityQueueWithLinkedList();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        PriorityQueue.Node display = obj.dequeue();
        System.out.println("Your Deleted Node -- " + display);
    }
}
