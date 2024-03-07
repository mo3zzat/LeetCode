class Solution {
    public String largestGoodInteger(String num) {
        String res = "";
        int i = 0;
        int k = 2;
        int max = Integer.MIN_VALUE;
        while (k<num.length()){
            String s = num.substring(i , k + 1);
            int val = Integer.parseInt(s);
            if(val % 111 == 0 && val > max) {
                System.out.println(val);
                max = val;
                res = s;
            }
            i++;
            k++;
        }
        return res;
    }
}