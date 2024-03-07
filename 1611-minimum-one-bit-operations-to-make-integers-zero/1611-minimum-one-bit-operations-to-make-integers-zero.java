class Solution {
    public int minimumOneBitOperations(int n) {
        int mt = 1;
        int rs = 0;
        while(n>0){
            rs += n ^ (n-1) * mt;
            mt = -1 * mt;
            n &=n-1;
        }
        return Math.abs(rs);
    }
}