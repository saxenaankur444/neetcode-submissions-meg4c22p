/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxPathSum(TreeNode root) {
        int[] res = new int[] {root.val};
        maxSum(root, res);
        return res[0];
    }

    public int maxSum(TreeNode root, int[] res) {
        if (root == null)
            return 0;
        int l = Math.max(maxSum(root.left, res), 0);
        int r = Math.max(maxSum(root.right, res), 0);
        res[0] = Math.max(root.val + l + r, res[0]);
        return root.val + Math.max(l, r);
    }
}
