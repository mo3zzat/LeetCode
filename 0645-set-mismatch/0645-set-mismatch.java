class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] cnt = new int[nums.length+1];
        for(int n :nums){
            cnt[n]++;
        }
        int c = 0 , d = 0;
        for(int i = 1 ; i < cnt.length ;i++){
            if(cnt[i]==2){
                c = i;
            }else if(cnt[i] == 0){
                d = i;
            }
        }
        return new int[]{c , d};
    }
}