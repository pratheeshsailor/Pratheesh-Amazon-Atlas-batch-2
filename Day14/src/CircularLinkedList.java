// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// CircularLinkedList class
public class CircularLinkedList {
    Node head = null;
    Node tail = null;

    // Method to add a node to the circular list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Circular link
        } else {
            tail.next = newNode; // Add new node after tail
            tail = newNode;      // Move tail to new node
            tail.next = head;    // Maintain circular link
        }
    }

    // Method to traverse and display the circular list
    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Circular Linked List Elements: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);  // Stop when we reach the head again

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Adding 4 elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Displaying the list
        list.display();
    }
}
