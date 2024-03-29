class Solution {
    public int numSpecial(int[][] mat) {
        int cnt = 0;
        for(int i = 0 ; i < mat.length ; i++){
            int sp = checkRow(mat , i);
            if(sp >= 0 && checkColumn(mat , i , sp))
                cnt++;
        }
        return cnt;
    }

     private int checkRow(int[][] mat, int i) {
        int index = -1;
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[i][j] == 1) {
                if (index >= 0)
                    return -1;
                else
                    index = j;
            }
        }
        return index;
    }

    private boolean checkColumn(int[][] mat, int i, int index) {
        for (int j = 0; j < mat.length; j++) {
            if (mat[j][index] == 1 && j != i)
                return false;
        }
        return true;
    }
}