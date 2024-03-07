public class Solution {
    public int MySqrt(int x) {
       if (x < 2) return x;
                int left = 2;
                int rigth = x / 2;
                while(left <= rigth)
                {
                    int m = (left + rigth) / 2;
                    if (m * m == x) return m;
                    if ((long)m * m < x) left = m + 1;
                    else rigth = m - 1;
                }
                return rigth;
    }
}