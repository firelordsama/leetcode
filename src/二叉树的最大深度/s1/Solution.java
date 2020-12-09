/**
 * 104. 二叉树的最大深度
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {

        if (null == root) {
            return 0;
        }
        return (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1);
    }
}