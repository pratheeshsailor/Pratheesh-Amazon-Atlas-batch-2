import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int val) {
        data = val;
        left = right = null;
    }
}

public class CornerNodes {

    public static void printCornerNodes(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode first = null, last = null;

            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();

                if (i == 0) {
                    first = current;
                }
                if (i == size - 1) {
                    last = current;
                }

                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }

            // Print the corner nodes for this level
            if (first == last) {
                System.out.println(first.data);
            } else {
                System.out.println(first.data + " " + last.data);
            }
        }
    }

    public static void main(String[] args) {
        // Building a binary tree with 15 nodes
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        System.out.println("Corner nodes of each level:");
        printCornerNodes(root);
    }
}
