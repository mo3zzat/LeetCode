class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row = mat.length, col = mat[0].length;
        Map<Integer,int[]> mp = new HashMap<>();
        int[] rows = new int[row];
        int[] cols = new int[col];
        Arrays.fill(rows,col);
        Arrays.fill(cols,row);

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mp.put(mat[i][j],new int[] {i, j});
            }
        }

        for(int i = 0; i < row * col; i++){
            int[] pos = mp.get(arr[i]);
            if(--cols[pos[1]] == 0 || --rows[pos[0]] == 0)
                return i;
        }
        return -1;
    }
}