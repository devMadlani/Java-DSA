package Questions;

public class Q_13_Leetcode_108_sortedArrayToBTS {
    TreeNode root;
    public TreeNode sortedArrayToBTS(int[] nums){
        sortedArrayToBTS(nums, 0, nums.length);
        return  root;
    }
    public void sortedArrayToBTS(int[] nums, int s, int e){
        if(s >= e){
            return;
        }
        int mid = s + (e - s) / 2;
        root = insert(nums[mid], root);
        sortedArrayToBTS(nums, s, mid);
        sortedArrayToBTS(nums, mid+1, e);

    }

    private TreeNode insert(int val, TreeNode node) {
        if(node == null) return null;

        if(val < node.val) node.left = insert(val, node.left);
        if(val > node.val) node.right = insert(val, node.right);

        return node;
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
