class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
       for(char x :s.toCharArray() ){
           if(x == '(') stk.push(')');
           else if(x == '{') stk.push('}');
           else if(x == '[') stk.push(']');
           else if (stk.isEmpty() || stk.pop() != x) return false;
       }
       return stk.isEmpty();
    }
}