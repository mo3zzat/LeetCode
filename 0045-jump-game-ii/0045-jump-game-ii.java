class Solution {
    public int jump(int[] nums) {
        int cnt = 0;
        int fre = 0;
        int end  = 0;
        for(int i = 0; i< nums.length - 1; i++){
            fre = Math.max(fre , i + nums[i]);
            if(fre >=nums.length - 1){
                ++cnt;
                break;
            }
            if(end == i){
                cnt++;
                end = fre;
            }
        }
        return cnt;
    }
}