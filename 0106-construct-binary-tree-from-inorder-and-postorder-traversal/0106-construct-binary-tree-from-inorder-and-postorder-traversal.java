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
    private int i , o;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        i = o = postorder.length - 1;
        return dfs(inorder, postorder, 3001);
    }
    private TreeNode dfs(int[] inorder, int[] postorder, int stop) {
        if(o == -1 || inorder[i] == stop ) return null;
        TreeNode node = new TreeNode(postorder[o--]);
        node.right = dfs(inorder, postorder, node.val);
        i--;
        node.left = dfs(inorder,postorder ,stop);
        return node;
    }
}