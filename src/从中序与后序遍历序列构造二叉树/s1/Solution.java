/**
 * 106. 从中序与后序遍历序列构造二叉树
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return this.buildTree(inorder, postorder, 0, inorder.length-1, postorder.length-1);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int start, int end, int pIndex) {

        if(start > end) return null;

        int rootVal = postorder[pIndex];
        TreeNode root =  new TreeNode(rootVal);

        if(start == end) return root;

        int index = this.getIndex(inorder, start, end, rootVal);

        root.left = this.buildTree(inorder, postorder, start, index-1, pIndex-end+index -1);
        root.right = this.buildTree(inorder, postorder, index+1,end, pIndex-1);

        return root;
    }

    protected int getIndex(int[] array, int start, int end, int target) {

        for(int i = start; i <= end; i ++) {

            if(target == array[i]) return i;
        }

        return -1;
    }
}