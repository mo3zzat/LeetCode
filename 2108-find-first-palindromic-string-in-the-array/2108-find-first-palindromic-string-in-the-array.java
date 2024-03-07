class Solution {
     public boolean isPalandrom(String s){
        int l = 0 , r = s.length() - 1;
        while (l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s : words){
            if(isPalandrom(s)){
                return s;
            }
        }
        return "";
    }
}