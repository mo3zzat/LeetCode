class Solution {
    public int minCost(String colors, int[] neededTime) {
         int totalTime = 0;
        int i =0 , j = 0;
        int n = neededTime.length;
        while(i < n && j < n){
            int currMax  = 0 , curr = 0;
            while (j < n && colors.charAt(i) == colors.charAt(j)){
                curr += neededTime[j];
                currMax = Math.max(currMax , neededTime[j]);
                j++;
            }
            totalTime += curr - currMax;
            i = j;
        }
        return totalTime;
    }
}