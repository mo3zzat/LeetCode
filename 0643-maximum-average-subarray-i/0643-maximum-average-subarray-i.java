class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int r = 0; r< k ; r++){
            sum+=nums[r];
        }
        int max = sum;
        for(int i = k ; i < nums.length ; i++){
            sum += nums[i];
            sum -= nums[i - k];
            max = Math.max(sum , max);
        }
        return (double) max / k;
    }
}