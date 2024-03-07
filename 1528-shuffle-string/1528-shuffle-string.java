class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] chars = new char[n];
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            chars[indices[i]] = c;
        }
        return new String(chars);
    }
}