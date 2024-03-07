class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i < accounts.length;i++){
             max = Math.max(max ,Arrays.stream(accounts[i]).sum());
        }
        return max;
    }
}