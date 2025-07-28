
// Define a Node class
class Node {
    int data;       // Data part
    Node next;      // Pointer to next node

    // Constructor
    Node(int value) {
        data = value;
        next = null;
    }
}

// Define LinkedList class
class LinkedList {
    private Node head;  // Head of the list

    // Constructor initializes empty list
    public LinkedList() {
        head = null;
    }

    // Insert node at the end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Delete node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;  // Java's GC will collect the unreferenced node
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// Main class to test the LinkedList
public class LinkedListtestcase {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("Linked List: ");
        list.display();  // Output: 10->20->30->NULL

        list.deleteByValue(20);

        System.out.print("After Deleting 20: ");
        list.display();  // Output: 10->30->NULL
    }
}
