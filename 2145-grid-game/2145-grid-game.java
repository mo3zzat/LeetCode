class Solution {
    public long gridGame(int[][] grid) {
        long top = 0;
        for(int n : grid[0]){
            top += n;
        }
        long bottom = 0, res = Long.MAX_VALUE;
        for(int i = 0; i < grid[0].length; i++){
            top -= grid[0][i];
            res = Math.min(res, Math.max(top, bottom));
            bottom += grid[1][i];
        }
        return res;
    }
}