package Questions;

import java.util.*;

public class Q_4_LeetCode_103_zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode currNode = queue.pollFirst();
                    currentLevel.add(currNode.val);
                    if (currNode.left != null) queue.offerLast(currNode.left);
                    if (currNode.right != null) queue.offerLast(currNode.right);
                } else {
                    TreeNode currNode = queue.pollLast();
                    currentLevel.add(currNode.val);
                    if (currNode.right != null) queue.offerFirst(currNode.right);
                    if (currNode.left != null) queue.offerFirst(currNode.left);

                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
