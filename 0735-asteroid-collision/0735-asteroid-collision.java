class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> sk = new Stack<>();
        for(int ast : asteroids){
            boolean al = true;
            while (!sk.isEmpty() && ast < 0 && sk.peek() > 0){
                if(sk.peek() < -ast){
                    sk.pop();
                    continue;
                }else if(sk.peek() == -ast)
                    sk.pop();
                al = false;
                break;
            }
            if(al){
                sk.push(ast);
            }
        }
        int[] res = new int[sk.size()];
        for(int i = sk.size() - 1; i >= 0; i--){
            res[i] = sk.pop();
        }
        return res;
    }
}