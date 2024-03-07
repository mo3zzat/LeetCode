class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int ans = nums[i];
        while(i < nums.length - 1){
            ans =ans^nums[++i];
        }
        return ans;
    }
}