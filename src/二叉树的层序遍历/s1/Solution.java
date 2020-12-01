/**
 * 102. 二叉树的层序遍历
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

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        getResult(result, 1, root);

        return  result;
    }

    private void getResult(List<List<Integer>> result, int level, TreeNode node) {

        if (null == node) {
            return;
        }
        if(result.size() < level) {
            result.add(new ArrayList<Integer>());
        }
        result.get(level-1).add(node.val);
        getResult(result, level + 1, node.left);
        getResult(result, level + 1, node.right);
    }
}