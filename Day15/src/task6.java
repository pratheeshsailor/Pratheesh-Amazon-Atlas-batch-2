class TreeNode2 {
    int value;
    TreeNode2 left, right;

    TreeNode2(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTreeOperations {
    TreeNode2 root;
    int i = 0;

    // Constructor
    public BinarySearchTreeOperations() {
        this.root = null;
    }

    // Insert operations
    void insert(int value) {
        root = insertVal(root, value);
    }

    TreeNode2 insertVal(TreeNode2 node, int value) {
        if (node == null) {
            node = new TreeNode2(value);
            return node;
        }
        if (value < node.value) {
            node.left = insertVal(node.left, value);
        } else if (value > node.value) {
            node.right = insertVal(node.right, value);
        }
        return node;
    }

    // Search operation
    public TreeNode2 search(int key) {
        TreeNode2 current = root;
        while (current != null) {
            if (key == current.value) {
                return current;
            } else if (key < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    // Traversal operations
    void inorder() {
        inorderVal(root);
    }

    void inorderVal(TreeNode2 node) {
        if (node != null) {
            inorderVal(node.left);
            System.out.println(node.left + " " + node.value + " " + node.right + " ===> " + i++);
            inorderVal(node.right);
        }
    }
}

public class task6 {
    public static void main(String[] args) {
        BinarySearchTreeOperations bst = new BinarySearchTreeOperations();

        // Insert operations
        bst.insert(10);
        bst.insert(50);
        bst.insert(400);
        bst.insert(70);
        bst.insert(5);

        // Inorder traversal
        System.out.println("Inorder traversal of Binary Search Tree:");
        bst.inorder();

        // Search operations
        int searchKey = 70;
        TreeNode2 result = bst.search(searchKey);
        if (result != null) {
            System.out.println("\nFound " + searchKey + " in the tree");
        } else {
            System.out.println("\n" + searchKey + " not found in the tree");
        }
    }
}
