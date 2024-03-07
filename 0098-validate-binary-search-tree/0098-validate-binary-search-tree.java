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
        List<Integer> lst = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        for(int i = 0; i < lst.size() - 1; i++){
            if(lst.get(i) >= lst.get(i+1))
                return false;
        }
        return true;
    }
    private void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        lst.add(root.val);
        inOrder(root.right);
    }
}