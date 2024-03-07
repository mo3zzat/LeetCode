class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {
        int sum = 0;
        for(int n : arr){
            sum +=n;
        }
        int l = 0;
        int r = sum;
        int[] res = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            r -= arr[i];
            res[i] = arr[i] * i - l + r - arr[i] * (arr.length - i -1);
            l += arr[i];
        }
        return res;
    }
}