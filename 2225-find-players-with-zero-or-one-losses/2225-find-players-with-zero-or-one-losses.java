class Solution {
     
    public List<List<Integer>> findWinners(int[][] matches) {
       int[] loser = new int[100001];
       List<List<Integer>> result = new ArrayList<>();
       for(int i = 0 ; i < matches.length ; i++){
           int win = matches[i][0];
           int lose = matches[i][1];
           if(loser[win] == 0){
               loser[win] = -1;
           }
           if(loser[lose] == -1){
               loser[lose] = 1;
           }else{
               loser[lose]++;
           }
       }
       List<Integer> zeroLose = new ArrayList<>();
       List<Integer>oneLose = new ArrayList<>();
       for(int i = 0; i < 100001 ; i++){
           if(loser[i] == -1){
               zeroLose.add(i);
           }else{
               if(loser[i] == 1){
                   oneLose.add(i);
               }
           }
       }
       result.add(zeroLose);
       result.add(oneLose);
       return result;
    }
}