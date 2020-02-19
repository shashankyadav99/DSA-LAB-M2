package node;

public class Node {
    int data, priority;
    Node next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", priority=" + priority +
                '}';
    }

    public Node(int d, int p) {
        data = d;
        priority = p;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
