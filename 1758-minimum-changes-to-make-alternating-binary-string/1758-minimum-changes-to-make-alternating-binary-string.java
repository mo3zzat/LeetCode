class Solution {
    private int cntOperation(String s ,char c){
        int cnt = 0;
        for(int i = 1 ; i < s.length() ; i++){
            char curr = s.charAt(i);
            if(c == curr){
                cnt++;
                c = curr == '1' ? '0' : '1';
            }else {
                c = curr;
            }
        }
        return cnt;
    }
    public int minOperations(String s) {
        char c = s.charAt(0);
        int cnt1 = cntOperation(s , c);
        int cnt2 = cntOperation(s , c == '0' ? '1' : '0') + 1;
        return Math.min(cnt1 , cnt2);
    }
}