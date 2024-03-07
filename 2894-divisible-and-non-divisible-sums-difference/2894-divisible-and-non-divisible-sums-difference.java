class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = (n* (n+1) ) / 2;
        if(m > n) return sum;
        if(m == 1) return -1 * sum;
        int cnt = n / m;
        int divsum = (cnt * (m*2 + (cnt -1) * m));
        return sum - divsum;
    }
}