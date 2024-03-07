public class Solution {
     private static int CountChar(char[] chs)
 {
     int cnt = 0;
     for(int i = 0; i < chs.Length; i++)
     {
         if (chs[i] =='1')
              cnt++;
     }
     return cnt;
 }
    public int[] CountBits(int n) {
         int[] arr = new int[n+1];
 for(int i = 0;i<=n ; i++)
 {
     char[] binary = Convert.ToString(i, 2).ToCharArray();
     arr[i] = CountChar(binary);
 }
 return arr;
    }
}