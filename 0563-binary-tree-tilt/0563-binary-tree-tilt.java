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
    private int result;
    public int findTilt(TreeNode root) {
        result = 0;
        findSum(root);
        return result;
    }
    private int findSum(TreeNode root){
        if(root == null) return 0;
        int left = findSum(root.left);
        int right = findSum(root.right);
        result += Math.abs(left - right);
        return left + right + root.val;
    }
}