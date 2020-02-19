package queue;

import node.Node;

public class PriorityQueue {
    Node front;

            public PriorityQueue() {
                front = null;
            }

            public void enqueue(Node newnode) {
                if (front == null || newnode.getPriority() < front.getPriority()) {
                    newnode.setNext(front);
                    front = newnode;
                }
                else {
                    Node temp = front;
                    while (temp.getNext() != null && temp.getNext().getPriority() < newnode.getPriority()) {
                        temp = temp.getNext();
                    }
                    newnode.setNext(temp.getNext());
                    temp.setNext(newnode);
                }
                System.out.println("Your Entered Node -- " + newnode);
            }

            public Node dequeue() {
                Node temp = front;
                front = front.getNext();
                return temp;
            }
        }
