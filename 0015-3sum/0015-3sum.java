class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();
        for(int i =0;i<nums.length ; i++){
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                if (nums[i] + nums[l] + nums[r] == 0){
                    s.add(Arrays.asList(nums[i] , nums[l] , nums[r]));
                    r--;
                    l++;
                }else if (nums[i] + nums[l] + nums[r] > 0) r--;
                else l++;
            }
        } 
        output.addAll(s);
        return output;
    }
}