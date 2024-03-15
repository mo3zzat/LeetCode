class Solution {
    public int[] productExceptSelf(int[] nums) {
         int cnt0 = 0, product = 1, j = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i <nums.length ; i++ ){
            if(nums[i] == 0){
                cnt0++;
                j = i;
            }else
                product *= nums[i];
        }
        if(cnt0 > 1){
            return res;
        }else if (cnt0 == 1){
            res[j] = product;
        }else{
            for(int i = 0;i<nums.length;i++){
                res[i] = product / nums[i];
            }
        }
        return res;
    }
}