class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] arr = new int[n];
        arr[0] = first;
        int k = first;
        for(int i = 1 ; i < n ; i++){
           k  = k ^encoded[i - 1];
           arr[i] = k;
        }
        return arr;
    }
}