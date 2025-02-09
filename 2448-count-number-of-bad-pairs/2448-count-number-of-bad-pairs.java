class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Long> big = new HashMap<>();
        long cnt = 0;
        int n= nums.length;
        for(int i = 0; i < n;i++){
            int diff = nums[i] - i;
            long num = big.getOrDefault(diff,0L);
            cnt += num;
            big.put(diff,num+1);
        }
        return 1l * n * (n-1)/2 - cnt;
    }
}