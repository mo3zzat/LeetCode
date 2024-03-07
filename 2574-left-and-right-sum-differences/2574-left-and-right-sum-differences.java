class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rigthsum = new int[nums.length];
        int sum1 = 0 , sum2 = 0;
        leftsum[0] = 0;
        rigthsum[nums.length - 1] = 0;
        for(int i =1 , j = nums.length - 2; i<nums.length;i++ , j--){
            sum1 += nums[i - 1];
            sum2 += nums[j + 1];
            leftsum[i] = sum1;
            rigthsum[j] = sum2;
        }
        for(int i =0; i<nums.length;i++){
            nums[i] = Math.abs(leftsum[i] - rigthsum[i]);
        }
        return nums;
    }
}