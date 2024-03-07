class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int i = 0 , j = 1 , k = 2;
        int cnt = 0;
        while (i < n && j < n && k < n){
            if(nums[j] - nums[i] > diff){
                i++;
            }else if(nums[j] - nums[i] < diff){
                j++;
            }else{
                if(nums[k] - nums[j] > diff){
                    j++;
                }else if(nums[k] - nums[j] < diff){
                    k++;
                }else{
                    cnt++;
                    k++;
                }
            }
        }
        return cnt;
    }
}