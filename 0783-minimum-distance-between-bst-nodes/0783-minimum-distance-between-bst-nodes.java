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
    int min = Integer.MAX_VALUE;
    TreeNode prevN;
    public int minDiffInBST(TreeNode root) {
        getMin(root);
        return min;
    }
    private void getMin(TreeNode root){
        if(root == null) return;
        getMin(root.left);
        if(prevN != null)
            min = Math.min(min, Math.abs(root.val - prevN.val));
        prevN = root;
        getMin(root.right);
    }
}