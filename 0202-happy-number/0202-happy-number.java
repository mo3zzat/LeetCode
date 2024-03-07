class Solution {
    public boolean isHappy(int n) {
        do{
            int sm = 0;
            while(n != 0){
                int d = n % 10;
                sm += d * d;
                n /= 10;
            }
            n = sm;
            if(n == 1) return true;
        }while(n != 4);
        return false;
    }
}