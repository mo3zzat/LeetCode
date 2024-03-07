class Solution {
    private void findSubsets(int idx, int[] nums, List<Integer> set, List<List<Integer>> subsets){
        if(idx == nums.length){
            subsets.add(new ArrayList<>(set));
            return;
        }
        findSubsets(idx+1 , nums , set ,subsets);
        set.add(nums[idx]);
        findSubsets(idx+1 , nums , set , subsets);
        set.remove(set.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> set = new ArrayList<>();
        List<List<Integer>> subsets = new ArrayList<>();
        findSubsets(0 , nums ,set ,subsets);
        return subsets;
    }
}