class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        else {
            for(int i = 1;i<= Math.sqrt(n);i++){
                if(Math.pow(4 , i) == n) return true;
            }
        }
        return false;
    }
}