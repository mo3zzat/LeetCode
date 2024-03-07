class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i : nums){
            cnt+=map.getOrDefault(i-k , 0);
            cnt+=map.getOrDefault(i+k , 0);
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        return cnt++;
    }
}