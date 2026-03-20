package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q_19_Leetcode_449_Serialize_Deserialize {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        helper(root, str);
        return str.toString();
    }

    void helper(TreeNode node, StringBuilder str) {
        if (node == null) {
            str.append("null,");
            return;
        }

        str.append(node.val).append(",");
        helper(node.left, str);
        helper(node.right, str);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);

        return helper2(list);
    }

    TreeNode helper2(List<String> list) {
        String val = list.remove(list.size() - 1);
        if (val.equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper2(list);
        node.right = helper2(list);
        return  node;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
