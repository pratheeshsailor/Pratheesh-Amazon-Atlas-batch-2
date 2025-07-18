import java.util.*;

class TreeNode1 {
    char val;
    TreeNode1 left, right;

    TreeNode1(char val) {
        this.val = val;
        left = right = null;
    }
}

public class ReverseEvenLevels {

    public static void reverseEvenLevels(TreeNode1 root) {
        if (root == null) return;

        Queue<TreeNode1> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode1> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode1 node = queue.poll();
                currentLevel.add(node);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            // Reverse node values at even levels (excluding level 0 if you prefer)
            if (level % 2 == 0 && level != 0) {
                int i = 0, j = currentLevel.size() - 1;
                while (i < j) {
                    char temp = currentLevel.get(i).val;
                    currentLevel.get(i).val = currentLevel.get(j).val;
                    currentLevel.get(j).val = temp;
                    i++;
                    j--;
                }
            }

            level++;
        }
    }

    // Level order printing
    public static void printLevelOrder(TreeNode1 root) {
        if (root == null) return;
        Queue<TreeNode1> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode1 node = q.poll();
                System.out.print(node.val + " ");
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create tree from A to O
        TreeNode1[] nodes = new TreeNode1[15];
        for (int i = 0; i < 15; i++) {
            nodes[i] = new TreeNode1((char)('A' + i));
        }

        // Build perfect binary tree
        for (int i = 0; i < 7; i++) {
            nodes[i].left = nodes[2 * i + 1];
            nodes[i].right = nodes[2 * i + 2];
        }

        TreeNode1 root = nodes[0];

        System.out.println("Original Tree:");
        printLevelOrder(root);

        reverseEvenLevels(root);

        System.out.println("\nTree After Reversing Even Levels:");
        printLevelOrder(root);
    }
}
