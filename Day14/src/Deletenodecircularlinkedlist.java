// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

// Circular Linked List class
public class Deletenodecircularlinkedlist {
    Node head = null;
    Node tail = null;

    // Add node to circular linked list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Delete node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        Node prev = tail;

        // Special case: deleting head node
        do {
            if (current.data == value) {
                if (current == head) {
                    if (head == tail) {
                        head = tail = null; // Only one node
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                System.out.println("Deleted node with value: " + value);
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Value " + value + " not found in the list.");
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List Elements: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Deletenodecircularlinkedlist list = new Deletenodecircularlinkedlist();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original list:");
        list.display();

        // Deleting a node
        list.delete(20);  // Delete middle
        list.display();
        // Try to delete from empty list
    }
}
