class Solution {
    public int minSteps(String s, String t) {
        int[] cnt = new int[26];
        int i = 0;
        while (i < s.length()) {
            cnt[t.charAt(i) - 'a']++;
            cnt[s.charAt(i) - 'a']--;
            i++;
        }
        int ans = 0;
        i = 0;
        while (i < 26){
            ans += Math.max(0 , cnt[i]);
            i++;
        }
        return ans;
    }
}