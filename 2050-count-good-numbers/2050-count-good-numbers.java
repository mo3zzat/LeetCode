class Solution {
    int mod=(int)1e9+7;
    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = (n+1)/2;
        
        return (int)(pow(4,odd) % mod * pow(5,even) % mod);
    }
    
    private long pow(int a,long b){
        if(b == 0) return 1;
        
        long temp = pow(a,b/2);
        
        if(b%2 == 0){
            return (temp * temp) % mod;
        }else{
            return a * (temp * temp) % mod;
        }
    }
}