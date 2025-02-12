class Solution {
    public int maximumSum(int[] nums) {
        int[] max = new int[82];
        int ans = -1;
        for(int n : nums){
            int sum = sumDigit(n);
            if(max[sum] != 0){
                ans = Math.max(ans, n + max[sum]);
            }
            max[sum] = Math.max(max[sum], n);
        }
        return ans;
    }
    
    private int sumDigit(int n){
        if(n == 0) return 0;
        return n%10 + sumDigit(n/10);
    }
}