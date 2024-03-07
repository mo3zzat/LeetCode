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
    private int findHigh(TreeNode root){
        if (root == null) return 0;
        else {
            int leftHeight = 0, rightHeight = 0;
            leftHeight = findHigh(root.left);
            rightHeight = findHigh(root.right);
            if(leftHeight == -1 || rightHeight == -1) return -1;
            if(Math.abs(leftHeight - rightHeight) > 1) return -1;
            return Math.max(leftHeight+1,rightHeight+1);
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null ) return true;
        if(findHigh(root) == -1) return false; 
        return true;
    }
}