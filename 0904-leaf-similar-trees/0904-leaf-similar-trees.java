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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        
        getLeaf(root1,ans1);
        getLeaf(root2,ans2);
        return ans2.equals(ans1);   
    }
    
    private void getLeaf(TreeNode root,List<Integer> lst){
        if(root == null) return;
        
        if(root.left == null && root.right == null)
            lst.add(root.val);
        getLeaf(root.left,lst);
        getLeaf(root.right,lst);
    }
}