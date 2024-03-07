class Solution {
    public  String baseConversion(String number, int sBase, int dBase)
    {
        return Integer.toString(
            Integer.parseInt(number, sBase), dBase);
    }
    public boolean isPalindromic (String s){
        int l =0 , r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        boolean flag = true;
        String num =String.valueOf(n);  
        for(int i =2 ; i<= n-2 ;i++){
            if(!(flag && isPalindromic(baseConversion(num , 10 , i) ) ) )return false;
        }
        return true;
    }
}