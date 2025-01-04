class Solution {
    public int compress(char[] chars) {
        int cnt = 0;
        int ans = 0;
        int n = chars.length;
        for(int i = 0; i < n;){
            final char letter = chars[i];
            cnt = 0;
            while (i < n && chars[i] == letter){
                cnt++;
                i++;
            }
            chars[ans++] = letter;
            if(cnt > 1){
                for(char ch : String.valueOf(cnt).toCharArray()){
                    chars[ans++] = ch;
                }
            }
        }
        return ans;
    }
}