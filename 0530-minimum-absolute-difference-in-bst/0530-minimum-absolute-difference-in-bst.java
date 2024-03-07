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
    public int getMinimumDifference(TreeNode root) {
        int[] a = new int[2];
        a[0] = Integer.MAX_VALUE;
        a[1] = Integer.MAX_VALUE;
        getMin(root,a);
        return a[0];
    }
    private void getMin(TreeNode root, int[] a){
        if(root == null) return;
        getMin(root.left,a);
        int def = Math.abs(root.val - a[1]);
        a[0] = Math.min(a[0],def);
        a[1] = root.val;
        getMin(root.right,a);
    }
}