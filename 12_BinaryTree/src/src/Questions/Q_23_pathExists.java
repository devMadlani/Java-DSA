package Questions;

public class Q_23_pathExists {
    boolean findPath(Q_22_Leetcode_124_MaxPathSum.TreeNode node, int[] arr) {
        if (node == null) {
            return arr.length == 0;
        }
        return helper(node, arr, 0);
    }

    private boolean helper(Q_22_Leetcode_124_MaxPathSum.TreeNode node, int[] arr, int idx) {
        if (node == null) return false;

        if (idx >= arr.length || node.val != arr[idx]) {
            return false;
        }
        if (node.left == null && node.right == null && idx == arr.length - 1) return true;

        return helper(node.left, arr, idx + 1) || helper(node.right, arr, idx + 1);
    }
}
