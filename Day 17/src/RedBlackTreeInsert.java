// Task 4: WAP to insert an element in Red-Black Tree

enum Color {
    RED, BLACK
}

class Node2 {
    int data;
    Color color;
    Node2 left, right, parent;

    public Node2(int data) {
        this.data = data;
        this.color = Color.RED;  // New nodes are red initially
        this.left = this.right = this.parent = null;
    }
}

public class RedBlackTreeInsert {
    private Node2 root;

    // Public insert method
    public void insert(int data) {
        Node2 newNode = new Node2(data);
        root = bstInsert(root, newNode);
        fixViolation(newNode);
    }

    // BST insert
    private Node2 bstInsert(Node2 root, Node2 node) {
        if (root == null)
            return node;

        if (node.data < root.data) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }

        return root;
    }

    // Fix Red-Black Tree violations
    private void fixViolation(Node2 node) {
        Node2 parent = null;
        Node2 grandparent = null;

        while (node != root && node.parent.color == Color.RED) {
            parent = node.parent;
            grandparent = parent.parent;

            if (parent == grandparent.left) {
                Node2 uncle = grandparent.right;

                if (uncle != null && uncle.color == Color.RED) {
                    // Case 1 - Recoloring
                    parent.color = Color.BLACK;
                    uncle.color = Color.BLACK;
                    grandparent.color = Color.RED;
                    node = grandparent;
                } else {
                    // Case 2 - Left-Right or Left-Left
                    if (node == parent.right) {
                        node = parent;
                        leftRotate(node);
                    }
                    // Left-Left case
                    parent.color = Color.BLACK;
                    grandparent.color = Color.RED;
                    rightRotate(grandparent);
                }
            } else {
                Node2 uncle = grandparent.left;

                if (uncle != null && uncle.color == Color.RED) {
                    // Case 1 - Recoloring
                    parent.color = Color.BLACK;
                    uncle.color = Color.BLACK;
                    grandparent.color = Color.RED;
                    node = grandparent;
                } else {
                    // Case 2 - Right-Left or Right-Right
                    if (node == parent.left) {
                        node = parent;
                        rightRotate(node);
                    }
                    // Right-Right case
                    parent.color = Color.BLACK;
                    grandparent.color = Color.RED;
                    leftRotate(grandparent);
                }
            }
        }

        root.color = Color.BLACK; // Ensure root is always black
    }

    // Left rotate
    private void leftRotate(Node2 x) {
        Node2 y = x.right;
        x.right = y.left;

        if (y.left != null)
            y.left.parent = x;

        y.parent = x.parent;

        if (x.parent == null)
            root = y;
        else if (x == x.parent.left)
            x.parent.left = y;
        else
            x.parent.right = y;

        y.left = x;
        x.parent = y;
    }

    // Right rotate
    private void rightRotate(Node2 y) {
        Node2 x = y.left;
        y.left = x.right;

        if (x.right != null)
            x.right.parent = y;

        x.parent = y.parent;

        if (y.parent == null)
            root = x;
        else if (y == y.parent.left)
            y.parent.left = x;
        else
            y.parent.right = x;

        x.right = y;
        y.parent = x;
    }

    // In-order traversal for testing
    public void inorder() {
        System.out.print("In-order traversal with color: ");
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node2 root) {
        if (root != null) {
            inorderHelper(root.left);
            System.out.print(root.data + "(" + root.color + ") ");
            inorderHelper(root.right);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        RedBlackTreeInsert tree = new RedBlackTreeInsert();

        // Example insertion
        int[] values = {10, 20, 30, 15, 25, 5};
        for (int val : values) {
            System.out.println("Inserting: " + val);
            tree.insert(val);
            tree.inorder();
        }
    }
}
