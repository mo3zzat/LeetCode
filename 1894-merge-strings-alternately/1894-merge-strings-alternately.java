class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len = Math.min(word1.length(),word2.length());
        while (i < len){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if(i < word1.length())
            sb.append(word1.substring(i));

        if(i < word2.length())
            sb.append(word2.substring(i));
        return sb.toString();
    }
}