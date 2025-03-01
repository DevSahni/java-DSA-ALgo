import java.util.*;

class Linkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add node to linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Remove node from linked list
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Node with data " + data + " not found.");
        }
    }

    // Print all nodes in linked list
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Search for a node in the linked list
    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add(19);
        list.add(20);
        list.add(90);

        System.out.println("Initial list:");
        list.printAll();

        list.remove(20);
        System.out.println("After removing 20:");
        list.printAll();

        System.out.println("Searching for 30: " + list.searchNode(30));
        System.out.println("Searching for 90: " + list.searchNode(90));
    }
}
