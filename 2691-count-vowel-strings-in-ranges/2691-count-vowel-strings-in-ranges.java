class Solution {
    private int isVowel(String s){
        char sc = s.charAt(0);
        char en = s.charAt(s.length()-1);
        if((sc == 'a' || sc == 'e' || sc == 'o' || sc == 'i' || sc == 'u') && (en == 'a' || en == 'e' || en == 'o' || en == 'i' || en == 'u')){
            return 1;
        }
        return 0;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] w = new int[words.length];
        int[] ans = new int[queries.length];
        w[0] = isVowel(words[0]);
        for(int i = 1; i<words.length;i++){
            w[i] = w[i-1] + isVowel(words[i]);
        }
        for(int i = 0;i<queries.length;i++){
            if(queries[i][0] == 0)
                ans[i] = w[queries[i][1]];
            else
                ans[i] = w[queries[i][1]] - w[queries[i][0] - 1];
        }
        return ans;
    }
}