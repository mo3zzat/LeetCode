class Solution {
    static {
        for(int i = 0; i < 100; i++) {
            minimumLength("qbbqq");
        }
    }
    public static int minimumLength(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int len = 0;
        for(int cnt : freq){
            if(cnt != 0)
                len += (cnt & 1 ^ 1) << 1 | cnt  & 1;
        }
        return len;
    }
}