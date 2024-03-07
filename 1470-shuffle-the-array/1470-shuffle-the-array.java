class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for(int i =0 , j = n ;i< n;i++ , j++){
            ans[index] = nums[i];
            ans[index+1] = nums[j];
            index +=2;
        }
        return ans;
    }
}