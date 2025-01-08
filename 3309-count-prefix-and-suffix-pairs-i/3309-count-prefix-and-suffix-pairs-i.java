class Solution {
    private boolean isPrefixAndSuffix(String s1, String s2){
        if(s1.length() <s2.length()) return false;
        return s1.indexOf(s2) == 0 && (s1.lastIndexOf(s2) + s2.length()) == s1.length() ;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length;j++){
                cnt += isPrefixAndSuffix(words[j], words[i]) ? 1 : 0;
            }
        }
        return cnt;
    }
}