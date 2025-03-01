package Linkedlist;

public class AddNode {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    public void printElement() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ->");
            currentNode = currentNode.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddNode list = new AddNode();
        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.addElement(40);
        list.printElement();
    }

}
