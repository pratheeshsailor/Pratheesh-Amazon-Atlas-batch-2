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

    void insert(int value) {                       // 10
        root = insertVal(root, value);      //root = null
    }
    TreeNode insertVal(TreeNode node, int value) { // null, 10 //
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }
        if (value < node.value) {
            node.left = insertVal(node.left, value);
        } else if (value > node.value) {
            node.right = insertVal(node.right, value);
        }
        return node;
    }

    void inorder() {
        inorderVal(root);
    }

    void inorderVal(TreeNode node) {
        if (node != null) {
            inorderVal(node.left);

            System.out.println("Node: " + node.value +
                    " | Left: " + (node.left != null ? node.left.value : "null") +
                    " | Right: " + (node.right != null ? node.right.value : "null"));

            inorderVal(node.right);
        }
    }
}

public class BinarySearchTree2 {
    public static void main(String[] args) {
        BinarySearchTreeOp bstobj = new BinarySearchTreeOp();

        bstobj.insert(50);
        bstobj.insert(10);
        bstobj.insert(400);
        bstobj.insert(70);
        bstobj.insert(5);
        System.out.println("here is the code for in inorder traversal of Binary search tree ");
        bstobj.inorder();
    }
}
 