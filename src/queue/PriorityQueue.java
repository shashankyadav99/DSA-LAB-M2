package queue;

public class PriorityQueue {
    public static class Node {
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

        static class PriorityQueueWithLinkedList {
            Node front;
            Node rear;

            public PriorityQueueWithLinkedList() {
                front = null;
                rear = null;
            }

            public void enqueue(Node newnode) {
                if (front == null || newnode.priority < front.priority) {
                    newnode.next = front;
                    front = newnode;
                }
                else {
                    Node temp = front;
                    while (temp.next != null && temp.next.priority < newnode.priority) {
                        temp = temp.next;
                    }
                    newnode.next = temp.next;
                    temp.next = newnode;
                }
                System.out.println("Your Entered Node -- " + newnode);
            }

            public Node dequeue() {
                Node temp = front;
                front = front.next;
                return temp;
            }
        }
    }
}
