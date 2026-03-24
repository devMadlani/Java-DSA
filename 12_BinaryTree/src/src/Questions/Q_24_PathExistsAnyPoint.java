package Questions;

import java.util.*;

public class Q_24_PathExistsAnyPoint {
    public int pathExistsAnyPoint(Q_22_Leetcode_124_MaxPathSum.TreeNode node, int sum) {
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }

    int helper(Q_22_Leetcode_124_MaxPathSum.TreeNode node, int sum, List<Integer> path) {
        if (node == null) return 0;

        path.add(node.val);
        int count = 0;
        int s = 0;
        // how many path I can take

        ListIterator<Integer> pathItr = path.listIterator(path.size());
        while (pathItr.hasPrevious()) {
            s += pathItr.previous();
            if (s == sum) {
                count++;
            }
        }
        count += helper(node.left, s, path) + helper(node.right, s, path);

        path.removeLast();
        return count;
    }
}
