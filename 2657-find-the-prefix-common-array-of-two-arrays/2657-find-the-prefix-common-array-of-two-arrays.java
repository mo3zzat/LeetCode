class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        //if(A.length != B.length) return null;
        int n = A.length , cur = 0;
        int[] res = new int[n];
        int[] seen = new int[n + 1];
        for(int i = 0; i < n ; i++){
            if(++seen[A[i]] == 2){
                cur++;
            }
            if(++seen[B[i]] == 2)
                cur++;
            res[i] = cur;
        }
        return res;
    }
}