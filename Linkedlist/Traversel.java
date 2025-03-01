package Linkedlist;

import java.util.List;

public class Traversel {
    // linkedlist traversel like each element
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

    }

    public void printAllElement() {

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // count nodes in linkedlist
    public int countNodes() {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;

    }

    public static void main(String[] args) {
        Traversel t = new Traversel();
        t.add(10);
        t.add(105);
        t.add(123);
        t.add(140);
        t.printAllElement();
        System.out.println("The total numbers of Nodes is : " + t.countNodes());

    }

}
