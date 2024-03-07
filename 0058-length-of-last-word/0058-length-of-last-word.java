class Solution {
    public int lengthOfLastWord(String s) {
        int cnt = 0;
        s = s.trim();
        for(int i = s.length() - 1 ; i>=0 ;i--){
            if(s.charAt(i) != ' ') cnt++;
            else break;
        }
        return cnt;
    }
}