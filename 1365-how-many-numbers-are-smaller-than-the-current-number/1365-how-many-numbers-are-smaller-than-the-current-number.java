class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> ms = new HashMap<>();
        int[] ans = new int[nums.length];
        int[] copy = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);
        for(int i=0;i<copy.length;i++){
            if(!ms.containsKey(copy[i]))
            ms.put(copy[i],i);
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=ms.get(nums[i]);
        }
        return ans;

    }
}