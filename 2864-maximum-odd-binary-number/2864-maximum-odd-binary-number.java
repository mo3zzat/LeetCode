class Solution {
    public String maximumOddBinaryNumber(String s) {
        int[] a = new int[2];
        for(int i = 0;i<s.length();i++){
            a[s.charAt(i) - '0']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<a[1]-1;i++) sb.append(1);
        for(int i = 0;i<a[0];i++) sb.append(0);
        sb.append(1);
        return sb.toString();
    }
}