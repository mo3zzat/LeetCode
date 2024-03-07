class Solution {
    public int strStr(String haystack, String needle) {
        boolean find = haystack.contains(needle);
        int n = -1;
        if(find){
             n = haystack.indexOf(needle);
        }
        return n;  
    }
}