class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int len = 0;
        for(int cnt : freq){
            if(cnt != 0)
                len += cnt % 2 != 0? 1 : 2;
        }
        return len;
    }
}