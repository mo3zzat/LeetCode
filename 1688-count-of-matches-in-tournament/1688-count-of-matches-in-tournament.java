class Solution {
    public int numberOfMatches(int n) {
        int sum = 0 ;
        while(n > 1){
            int y = n%2 == 0 ? (n / 2) : ((n-1) / 2);
            sum += y;
            n = n -y;
        }
        return sum;
    }
}