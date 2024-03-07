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
    private boolean isSub(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val != subRoot.val) return false;
        return isSub(root.right , subRoot.right) && isSub(root.left , subRoot.left);
    }
    boolean val;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        return  isSub(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}