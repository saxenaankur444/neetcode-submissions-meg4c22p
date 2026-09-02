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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;
        if (same(root, subRoot))
            return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean same(TreeNode root, TreeNode root2) {
        if (root == null && root2 == null)
            return true;
        if (root == null || root2 == null)
            return false;
        if (root.val != root2.val) {
            return false;
        } else {
            return same(root.left, root2.left) && same(root.right, root2.right);
        }
    }
}
