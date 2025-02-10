class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int mxLen = 1, incLen = 1,decLen = 1;
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i] < nums[i+1]){
                incLen++;
                decLen = 1;
            }else if(nums[i] > nums[i+1]){
                incLen = 1;
                decLen++;
            }else{
                incLen = 1;
                decLen = 1;
            }
            mxLen = Math.max(mxLen, Math.max(decLen, incLen));
        }
        return mxLen;
    }
}