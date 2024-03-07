public class Solution {
    public int ArrangeCoins(int n) {
       return (int)((Math.Sqrt(n * 8L + 1) - 1) / 2);
    }
}