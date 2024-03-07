class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i< nums.length ; i++){
            lst.add(index[i] , nums[i]);
        }
        for(int i = 0 ; i < lst.size() ;i++){
            target[i] = lst.get(i);
        }
        return target;
    }
}