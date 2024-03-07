class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> list = new ArrayList<>();
        Map<Integer , Integer> dict = new HashMap();
        for(int i =0;i<nums.length;i++){
            dict.put(nums[i] , dict.getOrDefault(nums[i] , 0) + 1);
        }
        int tresh = nums.length / 3;
        for(Map.Entry<Integer, Integer> entry : dict.entrySet()){
            if(entry.getValue() > tresh){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}