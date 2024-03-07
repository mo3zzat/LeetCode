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
     private int sum;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        dfs(root,0);
        return sum;
    }
    private void dfs(TreeNode root, int prev){
        prev = 10 * prev + root.val;
        if(root.left == null && root.right == null) {
            sum += prev;
            return;
        }
        if(root.left != null) {
            dfs(root.left, prev);
        }
        if(root.right != null) {
            dfs(root.right,prev);
        }
    }
}