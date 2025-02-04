class Solution {
    public int maxAscendingSum(int[] nums) {
        int mx = 0,sum = 0,n = nums.length;
        if(n == 1) return nums[0];
        for(int i = 0; i < n - 1;i++){
            if(nums[i] < nums[i+1]){
                sum += nums[i];
            }else{
                sum += nums[i];
                mx = Math.max(sum,mx);
                sum = 0;
            }
        }
        if(nums[n-2] < nums[n-1])
            sum+=nums[n-1];
        return Math.max(sum,mx);
    }
}