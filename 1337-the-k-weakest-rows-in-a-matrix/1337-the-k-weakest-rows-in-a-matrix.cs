public class Solution {
    public int[] KWeakestRows(int[][] mat, int k) {
        List<(int, int)> weaker = new List<(int, int)>();
        int[] we = new int[k];
        for(int i = 0;i < mat.Length;i++)
        {
            weaker.Add((mat[i].Sum() , i));
        }
        weaker = weaker.OrderBy(x=>x.Item1).ToList<(int, int)>();

        for (int i = 0; i < k; i++)
        {
            we[i] = weaker[i].Item2;
        }
        return we;
    }
}