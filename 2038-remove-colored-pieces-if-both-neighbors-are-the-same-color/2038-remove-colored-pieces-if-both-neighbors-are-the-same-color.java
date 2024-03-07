class Solution {
    public boolean winnerOfGame(String colors) {
        int counTA = 0;
        int countB = 0;
        int bob = 0;
        int alic = 0;
        for(int i =0;i<colors.length();i++){
            if(colors.charAt(i) == 'A'){
                counTA++;
                countB = 0;
                if(counTA == 3){
                    alic++;
                    counTA = 2;
                }
            }else{
                countB++;
                counTA = 0;
                if(countB == 3){
                    bob++;
                    countB = 2;
                }
            }
        }
        return alic > bob ? true : false;
    }
}