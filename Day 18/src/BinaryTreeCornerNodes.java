import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

class BinaryTreeCornerNodes {
    Node root;

    void printCorner(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);


        while (!q.isEmpty()) {
            int n = q.size();
            System.out.println("\nLevel size (queue size): " + n);

            for (int i = 0; i < n; i++) {
                Node temp = q.poll(); // Retrieve and remove the node
                System.out.println("Processing node: " + temp.key + " at i = " + i);

                // Print corner nodes (first and last of the level)
                if (i == 0 || i == n - 1) {
                    System.out.print("Corner node: " + temp.key + "  ");
                }

                // Add children to queue
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeCornerNodes tree = new BinaryTreeCornerNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.printCorner(tree.root);
    }
}
