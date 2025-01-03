class Solution {
    private void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public String reverseVowels(String s) {
        boolean isVowels[] = new boolean[128];
        char[] chars = s.toCharArray();
        for(char c : "aeiouAEIOU".toCharArray())
            isVowels[c] = true;

        int st = 0, en = s.length() - 1;

        while (st < en){
            if(!isVowels[chars[st]]){
                st++;
                continue;
            }
            if(!isVowels[chars[en]]){
                en--;
                continue;
            }
            swap(chars,st++,en--);
        }
        return new String(chars);
    }
}