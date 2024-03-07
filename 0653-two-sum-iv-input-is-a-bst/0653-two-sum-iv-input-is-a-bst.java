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
    private List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inOrderT(root);
        int i = 0 , j = list.size() - 1;
        int cnt = 0;
        while (i < j){
            int sum = list.get(i) + list.get(j);
            if(sum == k){
                return true;
            }else if(sum < k)
                i++;
            else j--;
        }
        return false;
    }
    private void inOrderT(TreeNode root){
        if(root == null) return;
        inOrderT(root.left);
        list.add(root.val);
        inOrderT(root.right);
    }
}