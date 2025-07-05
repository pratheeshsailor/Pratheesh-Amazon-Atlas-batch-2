class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

class BinarySearchTreeOp {
    TreeNode root;

    // Insert value into BST
    void insert(int value) {
        root = insertVal(root, value);
    }

    TreeNode insertVal(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.value) {
            node.left = insertVal(node.left, value);
        } else if (value > node.value) {
            node.right = insertVal(node.right, value);
        }
        return node;
    }
    // Inorder Traversal (Left, Root, Right)
    void inorder() {
        System.out.print("Inorder traversal: ");
        inorderVal(root);
        System.out.println();
    }

    void inorderVal(TreeNode node) {
        if (node != null) {
            inorderVal(node.left);
            System.out.print(node.value + " ");
            inorderVal(node.right);
        }
    }
    // Preorder Traversal (Root, Left, Right)
    void preorder() {
        System.out.print("Preorder traversal: ");
        preorderVal(root);
        System.out.println();
    }
    void preorderVal(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderVal(node.left);
            preorderVal(node.right);
        }
    }

    // Postorder Traversal (Left, Right, Root)
    void postorder() {
        System.out.print("Postorder traversal: ");
        postorderVal(root);
        System.out.println();
    }

    void postorderVal(TreeNode node) {
        if (node != null) {
            postorderVal(node.left);
            postorderVal(node.right);
            System.out.print(node.value + " ");
        }
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTreeOp bstobj = new BinarySearchTreeOp();

        // Inserting values
        bstobj.insert(10);
        bstobj.insert(50);
        bstobj.insert(40);
        bstobj.insert(70);
        bstobj.insert(5);

        // Traversals

        bstobj.inorder();


        bstobj.preorder();


        bstobj.postorder();
    }
}
