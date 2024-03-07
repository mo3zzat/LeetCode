class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = 2147483647;
        int l = 0;
        int total = 0;
        for(int r = 0; r < nums.length; r++){
            total +=nums[r];
            while(total>=target){
                len = Math.min(len , r - l + 1);
                total -=nums[l];
                l++;
            }
        }
        if (len == 2147483647 ) return 0;
        else return len;
    }
}