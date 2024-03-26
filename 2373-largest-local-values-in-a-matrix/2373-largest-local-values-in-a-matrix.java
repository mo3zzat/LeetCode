class Solution {
    private int max(int[][] mat,int row,int col){
        int max = Integer.MIN_VALUE;
        for(int i = row;i<3+row;i++){
            for(int j = col;j<3+col;j++){
                max = Math.max(mat[i][j],max);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];
        for(int i = 0;i<n-2;i++){
            for(int j = 0; j<n-2; j++){
                result[i][j] = max(grid,i,j);
            }
        }
        return result;
    }
}