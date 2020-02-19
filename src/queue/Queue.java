package queue;

import java.util.*;
import packagename.classname;
public class Queue {
    private static int[] arr;
    private static int front;
    private static int rear;
    private static int capacity;
    private static int count;

    public Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
        count = 0;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow");
            System.exit(1);
        }
        System.out.println("Removing " + arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    public static void enqueue(int item) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter number of data -- ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++)
            q.enqueue(scan.nextInt());

    }
}



