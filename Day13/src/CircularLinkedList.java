public class CircularLinkedList {
    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Method to add a node to the circular linked list
    public void addNode(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  // Make it circular
        } else {
            tail.next = newNode;  // Add new node after tail
            tail = newNode;       // Make new node as tail
            tail.next = head;     // Connect tail to head
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    // Method to count nodes in the circular linked list
    public int countNodes() {
        if (head == null) return 0;

        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Adding nodes
        cll.addNode(1);
        cll.addNode(2);
        cll.addNode(3);
        cll.addNode(4);
        cll.addNode(5);

        // Display the list
        cll.display();

        // Display count of nodes
        System.out.println("Number of nodes: " + cll.countNodes());

        // Demonstrate circular nature
        System.out.println("\nDemonstrating circular nature (10 iterations):");
        Node current = cll.head;
        for(int i = 0; i < 10; i++) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}