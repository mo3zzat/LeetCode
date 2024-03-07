class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int len = 0;
        for(int i =0;i<k;i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') count++;
        }
        len = count;
        for(int i = k , j = 0;i <s.length() ; i++ , j++){
            char c = s.charAt(j);
            if(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') count--;
            c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') count++;
            len = Math.max(len , count);
        }
        return len;
    }
}