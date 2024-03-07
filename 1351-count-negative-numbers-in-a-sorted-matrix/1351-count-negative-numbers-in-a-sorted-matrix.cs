public class Solution {
    public int CountNegatives(int[][] grid)
        {
            int size = grid[0].Length;
            int cnt = 0;
            for (int i = 0; i < grid.Length; i++)
            {
                for(int j = size-1; j >= 0; j--)
                {
                    if (grid[i][j] < 0)
                        cnt++;
                }
            }
            return cnt;
        }
}