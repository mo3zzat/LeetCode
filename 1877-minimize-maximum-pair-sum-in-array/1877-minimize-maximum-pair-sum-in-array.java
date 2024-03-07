class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i =0 , j = nums.length - 1;
        int mx = Integer.MIN_VALUE;
        while(i < j){
            mx = Math.max(mx , nums[i]+nums[j]);
            i++;
            j--;
        }
        return mx;
    }
}