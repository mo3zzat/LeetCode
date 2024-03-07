class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack<Integer> stk = new Stack<Integer>();
        for(int i =0 ;i <tokens.length ; i++){
            if(!tokens[i].equals("*") && !tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/"))
                stk.push(Integer.parseInt(tokens[i]));
            else{
                int num1 = stk.pop();
                int num2 = stk.pop();
                switch(tokens[i]){
                    case "+"  :
                        res = num1 + num2;
                        break;
                    case "*"  :
                        res = num1 * num2;
                        break; 
                    case "/"  :
                        res = num2 / num1;
                        break;
                    case "-"  :
                        res = num2 - num1;
                        break;

                }
                stk.push(res);
            }
        }
        return stk.peek();
    }
}