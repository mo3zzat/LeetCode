class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length -2; i++){
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                int sum = nums[i] + nums[r] + nums[l];
                if(Math.abs(target - sum) < Math.abs(target - closestSum)){
                    closestSum = sum;
                }else if(sum < target){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return closestSum;
    }
}