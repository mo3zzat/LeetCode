class Solution {
    public int[] decompressRLElist(int[] nums) {
       int size = 0;
        for(int i=0; i<nums.length; i+=2){
            size+=nums[i];
        }
        int[] arr = new int[size];
        int startInd = 0;
        for(int i=0;i<nums.length; i+=2){
            Arrays.fill(arr,startInd,nums[i]+startInd,nums[i+1]);
            startInd += nums[i];
        }
        return arr;
    }
}