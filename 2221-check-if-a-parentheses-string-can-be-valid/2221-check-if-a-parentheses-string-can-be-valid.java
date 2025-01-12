class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length() % 2 != 0) return false;
        int op = 0, clo = 0,zero = 0;
        for(int i =0; i < s.length();i++){
            char c = s.charAt(i);
            if(locked.charAt(i) == '0') zero++;
            else if(c == '(') op++;
            else  clo++;

            if(zero < (clo - op)) return false;
        }
        op = 0;
        clo = 0;
        zero = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            if(locked.charAt(i) == '0') zero++;
            else if(c == '(') op++;
            else  clo++;

            if(zero < (op - clo)) return false;
        }
        return true;
    }
}