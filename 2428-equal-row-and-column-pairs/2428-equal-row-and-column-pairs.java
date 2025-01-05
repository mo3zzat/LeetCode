class Solution {
    List<Integer> getrow(int[][] grid, int in, int n) {
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(grid[in][i]);
        }
        return x;
    }
//getting a coloumn
    List<Integer> getcol(int[][] grid, int in, int n) {
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(grid[i][in]);
        }
        return x;
    }

    public int equalPairs(int[][] grid) {
        int c = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (getrow(grid, i, n).equals(getcol(grid, j, n)))//checking if they are equal
                {
                    c++;
                }
            }
        }
        return c;
    }
}