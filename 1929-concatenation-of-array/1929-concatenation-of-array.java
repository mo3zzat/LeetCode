class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length ];
        for(int i =0 , j = nums.length;i<nums.length ; i++ ,j++){
            arr[i] = nums[i];
            arr[j] = nums[i];
        }
        return arr;
    }
}