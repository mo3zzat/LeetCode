class Solution {
    private int countWord(String s){
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                r++;
            }
        }
        return r+1;
    }
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String s : sentences){
            max = Math.max(max , countWord(s));
        }
        return max;
    }
}