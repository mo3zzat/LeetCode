class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;
        int[] ind = new int[2];
        int j = 0;
        for(int i = 0; i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(j >= 2) return false;
                else{
                    ind[j++] = i; 
                }
            }
        }
        if(s1.charAt(ind[0]) == s2.charAt(ind[1])&& s2.charAt(ind[0]) == s1.charAt(ind[1])){
            return true;
        }
        return false;
    }
}