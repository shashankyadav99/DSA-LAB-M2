package reverseOrder;

import java.util.*;

public class MyLinkedList {
    static Node head;
    static class Node {
       int data;
       Node next;

       Node(int d) {
           data = d;
           next = null;
       }
   }

   public static void insert(int data) {
        Node new_node = new Node(data);
        if(head == null)
            head = new_node;
        else {
            Node last = head;
            while(last.next != null)
                last = last.next;
            last.next = new_node;
        }
   }

   public static void printList() {
        Node currNode = head;
        System.out.print("Linked List -- ");
        while(currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
   }

   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       MyLinkedList list = new MyLinkedList();
       for (int i = 0; i < 5; i++)
           list.insert(scan.nextInt());
       printList();

   }
}