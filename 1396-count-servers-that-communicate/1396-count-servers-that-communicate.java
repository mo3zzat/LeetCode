class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] rowFreq = new int[m];
        int[] colFreq = new int[n];
        
        for(int i = 0;i<m;i++){
            for(int j = 0; j < n;j++){
                if(grid[i][j] == 1){
                    rowFreq[i]++;
                    colFreq[j]++;
                }
            }
        }
        int cnt = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0; j < n;j++){
                if(grid[i][j] == 1){
                    if(rowFreq[i] > 1 || colFreq[j] > 1)
                        cnt++;
                }
            }
        }
        return cnt;
    }
}