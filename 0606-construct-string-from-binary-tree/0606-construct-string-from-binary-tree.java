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
    public String tree2str(TreeNode root) {
        if(root == null) return null;
        StringBuilder res = new StringBuilder();
        make(root , res);
        return res.toString();
    }

    public void make(TreeNode root , StringBuilder result){
        if(root == null) return;
        result.append(root.val);
        if(root.left != null){
            result.append("(");
            make(root.left , result);
            result.append(")");
        }else {
            if(root.right != null){
                result.append("()");
            }
        }
        if(root.right != null){
            result.append("(");
            make(root.right , result);
            result.append(")");
        }
    }
    
}