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
     TreeNode ans = new TreeNode();
     TreeNode nod = ans;
    public TreeNode increasingBST(TreeNode root) {
       help(root);
       return nod.right;
    }
    public void help(TreeNode node){
        if(node == null) return ;
        help(node.left);
        ans.right = new TreeNode(node.val);
        ans = ans.right;
        help(node.right);
    } 
}