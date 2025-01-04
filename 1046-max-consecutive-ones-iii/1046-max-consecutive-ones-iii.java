class Solution {
    public int longestOnes(int[] nums, int k) {
        int mx = 0, l = 0,cnt =0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 0){
                cnt ++;
            }

            while (cnt > k){
                if(nums[l] == 0)
                    cnt--;
                l++;
            }

            mx = Math.max(mx,r - l + 1);
        }
        return mx;
    }
}