package validate-binary-search-tree.s1

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {

        if(null == root) {
            return true;
        }
        if(null != root.left && getRstMode(root.left).val >= root.val) {
            return false;
        }
        if(null != root.right && root.val >= getLstMode(root.right).val) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }

    private TreeNode getRstMode(TreeNode node) {

        while(node.right != null) {
            node = node.right;
        }

        return node;
    }

    private TreeNode getLstMode(TreeNode node) {

        while(node.left != null) {
            node = node.left;
        }

        return node;
    }
}