class Solution {
    private int minOp(String s,int j){
        int min = 0;
        for(int i = 0; i < s.length(); i++){
            if( i != j){
                min += (s.charAt(i) - '0') *  Math.abs(i - j);
            }
        }
        System.out.println(j + "  " + min);
        return min;
    }
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = minOp(boxes,i);
        }
        return ans;
    }
}