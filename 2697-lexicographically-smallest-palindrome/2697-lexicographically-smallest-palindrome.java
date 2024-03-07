class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(ch[i] != ch[j]){
                char smallerChar = (char)Math.min(ch[i],ch[j]);
                ch[i] = smallerChar;
                ch[j] = smallerChar;
            }
        }
        return new String(ch);
    }
}