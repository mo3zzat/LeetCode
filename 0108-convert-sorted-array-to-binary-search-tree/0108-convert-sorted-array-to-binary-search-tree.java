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
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeTree(nums,0,nums.length-1);
    }
    private TreeNode makeTree(int[] nums, int i, int j){
        if(i > j) return null;
        int mid = i + (j - i) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = makeTree(nums,i,mid - 1);
        node.right = makeTree(nums, mid+1, j);
        return node;
    }
}