public class BinarySearchTree {

    // Node class
    private static class Node {
        int value;
        Node left, right;

        Node(int v) {
            value = v;
            left = right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert into an empty tree
    public void insertFirst(int value) {
        if (root != null) {
            System.out.println("Tree is not empty — use insert(value) instead.");
            return;
        }
        root = new Node(value);
    }

    // Insert into a non-empty tree
    public void insert(int value) {
        if (root == null) {
            System.out.println("Tree is empty — using insertFirst instead.");
            insertFirst(value);
        } else {
            root = insertRec(root, value);
        }
    }

    // Recursive insert helper
    private Node insertRec(Node node, int value) {
        if (node == null) return new Node(value);

        if (value < node.value) {
            node.left = insertRec(node.left, value);
        } else if (value > node.value) {
            node.right = insertRec(node.right, value);
        }
        // Skip duplicate
        return node;
    }

    // Inorder Traversal (Left → Root → Right)
    public void inorderTraversal() {
        System.out.print("Inorder traversal: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.value + " ");
            inorderRec(node.right);
        }
    }

    // Preorder Traversal (Root → Left → Right)
    public void preorderTraversal() {
        System.out.print("Preorder traversal: ");
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    // Postorder Traversal (Left → Right → Root)
    public void postorderTraversal() {
        System.out.print("Postorder traversal: ");
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.print(node.value + " ");
        }
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();


        bst.insertFirst(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);


        bst.inorderTraversal();
        bst.preorderTraversal();
        bst.postorderTraversal();
    }
}