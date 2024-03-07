class Solution {
    public int maxProfit(int[] prices) {
        int pri = 0;
        int pos = 0;
        int res = Integer.MAX_VALUE;
        for(int i =0 ;i <prices.length;i++){
            if(prices[i] < res) res = prices[i];
            pri = prices[i] - res;
            if(pos < pri) pos = pri;
        }
        return pos;
    }
}