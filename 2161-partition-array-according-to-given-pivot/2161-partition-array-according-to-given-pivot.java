class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int l =0 , r = nums.length - 1;
        for(int i =0; i <nums.length;i++){
            if(nums[i] < pivot){
                arr[l++] = nums[i];
            }
            if(nums[nums.length - 1 - i] > pivot){
                arr[r--] = nums[nums.length - 1-i];
            }
        }
        while(l <= r){
            arr[l++] = pivot;
            arr[r--] = pivot;
        }
        return arr;
    }
}