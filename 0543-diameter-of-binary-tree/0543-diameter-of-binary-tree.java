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
     public int diameterOfBinaryTree(TreeNode root) {
       int[] decm = new int[1];
       findHigh(root , decm);
       return decm[0];
    }

    private int findHigh(TreeNode root, int[] a){
        if (root == null) return 0;
        else {
            int leftHeight = findHigh(root.left,a);
            int rightHeight = findHigh(root.right,a);
            a[0] = Math.max(a[0], leftHeight+rightHeight);
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }
}