class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = grid.length, res = 0;
        for(int[] a : grid){
            int hash = getRow(a);
            map.put(hash,map.getOrDefault(hash,0) + 1);
        }

        for(int i = 0; i < n; i++){
            int hash = getCol(grid,i);
            res += map.getOrDefault(hash,0);
        }
        return res;
    }

    private int getRow(int[] a){
        int hash = 0;
        for (int i : a) {
            hash = i + hash * 5;
        }

        return hash;
    }

    private int getCol(int[][] grid,int col){
        int hash = 0;
        for(int i = 0; i < grid.length;i++){
            hash = grid[i][col] + hash * 5;
        }
        return hash;
    }
}