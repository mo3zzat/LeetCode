class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int mx = 0;
        for(int i = 0 ; i < citations.length ; i++){
            if(citations[i] >= citations.length - i){
                mx = Math.max(mx , citations.length - i);
            }
        }
        return mx;
    }
}