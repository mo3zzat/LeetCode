class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        boolean[] count = new boolean[1001];

        for(int i : arr){
            freq[i + 1000]++;
        }

        for(int num : arr){
            int cnt = freq[num + 1000];
            freq[num + 1000] = 0;
            if(cnt > 0 && count[cnt]){
                return false;
            }
            count[cnt] = true;
        }

        return true;
    }
}