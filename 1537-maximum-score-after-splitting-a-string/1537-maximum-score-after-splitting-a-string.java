class Solution {
    public int maxScore(String s) {
        int len = s.length();
        int ones = 0 , tmpScore = s.charAt(0) == '0' ? 1 :0 , score = tmpScore;
        for(int i = 1 ; i < len - 1 ; i++){
            if(s.charAt(i) == '0'){
                tmpScore++;
            }else{
                tmpScore--;
                ones++;
            }
            if(tmpScore > score){
                score = tmpScore;
            }
        }
        ones += s.charAt(len - 1) == '1' ? 1 : 0;
        return ones + score;
    }
}