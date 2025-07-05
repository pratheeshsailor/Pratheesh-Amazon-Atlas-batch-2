class TreeNode3 {
    int value;
    TreeNode3 left, right;

    TreeNode3(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree3 {
    TreeNode3 root;
    int i = 0;

    // Insert a value into the BST
    void insert(int value) {
        root = insertVal(root, value);
    }

    TreeNode3 insertVal(TreeNode3 node, int value) {
        if (node == null) {
            return new TreeNode3(value);
        }
        if (value < node.value) {
            node.left = insertVal(node.left, value);
        } else if (value > node.value) {
            node.right = insertVal(node.right, value);
        }
        return node;
    }

    // Search for a value in the BST
    TreeNode3 search(int key) {
        TreeNode3 current = root;
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

    // Inorder traversal with detailed output
    void inorder() {
        inorderVal(root);
    }

    void inorderVal(TreeNode3 node) {
        if (node != null) {
            inorderVal(node.left);
            System.out.println(
                    "Node: " + node.value +
                            " | Left: " + (node.left != null ? node.left.value : "null") +
                            " | Right: " + (node.right != null ? node.right.value : "null") +
                            " ===> Index: " + i++);
            inorderVal(node.right);
        }
    }
}

public class BSTree {
    public static void main(String[] args) {
        BinarySearchTree3 bst = new BinarySearchTree3();

        // Insert values into BST
        bst.insert(10);
        bst.insert(50);
        bst.insert(400);
        bst.insert(70);
        bst.insert(5);

        // Inorder traversal
        System.out.println("Inorder traversal of Binary Search Tree:");
        bst.inorder();

        // Search operations for multiple values
        int[] searchKeys = {70, 5, 100};
        for (int key : searchKeys) {
            TreeNode3 result = bst.search(key);
            if (result != null) {
                System.out.println("\nFound " + key + " in the tree.");
            } else {
                System.out.println("\n" + key + " not found in the tree.");
            }
        }
    }
}
