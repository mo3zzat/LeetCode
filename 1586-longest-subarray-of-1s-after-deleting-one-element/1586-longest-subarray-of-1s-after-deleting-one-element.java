class Solution {
    public int longestSubarray(int[] nums) {
        int mx = 0, l = 0,cnt =0,ind = -1;
        for(int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                cnt++;
            }

            while (cnt > 1) {
                if (nums[l] == 0)
                    cnt--;
                l++;
            }
            mx = Math.max(mx, r - l);
        }
        return mx;
    }
}