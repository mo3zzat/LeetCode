class Solution {
    public String decodeString(String s) {
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> strBuilder = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
                System.out.println(num);
            }else if(c == '['){
                stack.push(num);
                num = 0;
                strBuilder.push(sb);
                sb = new StringBuilder();
            }else if(c == ']'){
                int k = stack.pop();
                StringBuilder temp = sb;
                sb = strBuilder.pop();
                while (k > 0){
                    sb.append(temp);
                    k--;
                }
                System.out.println(sb.toString());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}