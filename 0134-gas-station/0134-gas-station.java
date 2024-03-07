class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0 ;
        int remain = 0;
        int total = 0;
        for(int i = 0 ; i < gas.length ; i++){
            int diff = gas[i] - cost[i];
            if(remain >=0){
                remain +=diff;
            }else{
                remain = diff;
                start = i;
            }
            total += diff;
        }
        return total >= 0 ? start : -1;
    }
}