class Solution {
    private char getChar(char c, int x ){
        int netShift = (x % 26 + 26) % 26;
        return (char) ('a' + (c - 'a' + netShift) % 26);
    }

    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shift = new int[n+1];

        for(int[] shiftOp : shifts){
            shift[shiftOp[0]] += (shiftOp[2] == 1) ? 1:-1;
            if(shift[1] + 1 < n)
                shift[shiftOp[1] + 1] -= (shiftOp[2] == 1) ? 1:-1;
        }

        int currentShift = 0;
        for (int i = 0; i < n; ++i) {
            currentShift += shift[i];
            shift[i] = currentShift;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(getChar(s.charAt(i),shift[i]));
        }
        return sb.toString();
    }
}