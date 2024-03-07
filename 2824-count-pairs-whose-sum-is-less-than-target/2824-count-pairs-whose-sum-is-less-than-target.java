class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l = 0 , r = nums.size() - 1;
        int sum1 = 0;
        while(l < r){
            if (nums.get(l) + nums.get(r) < target){
                 sum1 += (r - l);
                 l++;
            }else {
                r--;
            }
        }
        return sum1;
    }
}