class Solution {
    private boolean isVowel(char c){
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
            return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int mx = 0, cnt = 0;
        for(int i = 0; i < k ; i++){
            if(isVowel(s.charAt(i)))
                cnt++;
        }

        mx = cnt;
        for(int i = 1; i < s.length() - k + 1;i++){
            if(cnt == k) return k;

            cnt += isVowel(s.charAt(i-1)) ? -1 : 0;
            cnt += isVowel(s.charAt(i + k -1)) ? 1 : 0;

            mx = Math.max(mx,cnt);
        }
        return mx;
    }
}