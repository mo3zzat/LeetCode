class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        //if(A.length != B.length) return null;
        int n = A.length, curr = 0;
        int[] seen = new int[n+1];
        int[] result = new int[n];
        for(int i = 0; i < n;i++){
            if(++seen[A[i]] == 2)
                curr++;
            if (++seen[B[i]] == 2)
                curr++;
            result[i] = curr;
        }
        return result;
    }
}