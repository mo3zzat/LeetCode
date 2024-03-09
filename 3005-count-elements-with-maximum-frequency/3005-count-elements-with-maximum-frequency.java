class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums)
            mp.put(num,mp.getOrDefault(num,0)+1);
        int max = Integer.MIN_VALUE;
        for(int num : mp.values()){
            max = Math.max(max,num);
        }
        int cnt = 0;
        for(int num : mp.values()){
            if(num == max)
                cnt+=max;
        }
        return cnt;
    }
}