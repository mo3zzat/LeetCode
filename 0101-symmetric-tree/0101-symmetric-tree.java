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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        if(root.left == null || root.right == null) return false;
        q1.add(root.left);
        q2.add(root.right);
        while ((!q1.isEmpty()) && (!q2.isEmpty())){
            TreeNode temp1 = q1.remove();
            TreeNode temp2 = q2.remove();
            if(temp1.val != temp2.val){
                return false;
            }
            if(temp1.left != null || temp2.right != null){
                if(temp1.left == null)
                    return false;
                else if(temp2.right == null)
                    return false;
                else{
                    q1.add(temp1.left);
                    q2.add(temp2.right);
                }

            }
            if(temp1.right != null || temp2.left != null){
                if(temp1.right == null)
                    return false;
                else if(temp2.left == null)
                    return false;
                else{
                    q1.add(temp1.right);
                    q2.add(temp2.left);
                }
            }
        }
        return (q1.isEmpty()) && (q2.isEmpty());
    }
}