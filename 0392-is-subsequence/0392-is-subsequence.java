class Solution {
    public boolean isSubsequence(String s, String t) {
        int l = 0;
        for(int i = 0;i<t.length() && l < s.length();i++){
            if(s.charAt(l) == t.charAt(i)) l++;
        }
        if(l == s.length()) return true;
        else return false;
    }
}