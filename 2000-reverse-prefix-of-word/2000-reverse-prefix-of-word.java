class Solution {
    public String reversePrefix(String word, char ch) {
        int r = word.indexOf(ch);
        int l =0;
        if(!(r <=word.length())) return word;
        char[] chc = word.toCharArray();
        while(l <= r){
            char c = chc[l];
            chc[l] = chc[r];
            chc[r] = c;
            l++;
            r--;
        }
        return new String(chc);
    } 
}