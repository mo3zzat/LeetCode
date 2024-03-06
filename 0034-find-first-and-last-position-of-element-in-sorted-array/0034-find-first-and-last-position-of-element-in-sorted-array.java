class Solution {
     public int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearch(nums, target, true);
        int rightIndex = binarySearch(nums, target, false);
        if(leftIndex <= rightIndex)
            return new int[] {leftIndex , rightIndex};
        else return new int[] {-1 , -1};
    }

    public int binarySearch(int[] nums ,int target , boolean leftflag){
        int l =0 , r = nums.length-1 , mid;
        int ind = -1;
        while(l <= r){
            mid = l + (r-l) / 2;
            if(nums[mid] == target){
                ind = mid;
                if(leftflag)
                    r = mid - 1;
                else 
                    l = mid + 1;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return ind;
    }
}