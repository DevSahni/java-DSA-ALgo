package Linkedlist;

// this is the node class in which node contain data and next pointer 
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;

    }

}

public class SinglyLinked {

    // Add a new node at the end of the list
    Node head;

    public void addNode(int data) {
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

    // Print all elements in the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // delete a node from the list
    // Delete a node by value
    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            return;

        }
        // Find the node to be deleted
        Node currentNode = head;
        while (currentNode.next != null && currentNode.next.data != data) {
            currentNode = currentNode.next;

        }
        // node was found now delete it
        if (currentNode != null) {
            Node nextNode = currentNode.next;
        } else {
            System.out.println("Node not found");
        }

    }

}
