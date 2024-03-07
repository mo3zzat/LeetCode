class Solution {
    public String removeOuterParentheses(String s) {
        int count = 1;
        String str = "";
        if(s.length() <= 2) return "";
        for(int i = 1 ; i< s.length() ; i++){
            if(s.charAt(i) == '(' ){
                 count++;
                if(count > 1) str += '(';
               
            }  
            else {
                if(count > 1) str +=')';
                count--;
            }
        }
        return str;
    }
}