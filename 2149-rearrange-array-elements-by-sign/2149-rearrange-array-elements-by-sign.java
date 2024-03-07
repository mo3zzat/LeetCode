class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0 , odd = 1;
        for(int num : nums){
            if(num > 0){
                res[even] = num;
                even +=2;
            }else{
                res[odd] = num;
                odd +=2;
            }
        }
        return res;
    }
}