class Solution {
    private void setRowZero(int[][] matrix,int[] row){
        for(int i = 0; i < matrix.length;i++){
            if(row[i] > 0){
                row[i] = 0;
                Arrays.fill(matrix[i], 0);
            }
        }
    }

    private void setColZero(int[][] matrix,int[] col){
        for(int i = 0; i < col.length;i++){
            if(col[i] > 0){
                col[i] = 0;
                for(int j = 0; j < matrix.length;j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        setRowZero(matrix,row);
        setColZero(matrix,col);
    }
}