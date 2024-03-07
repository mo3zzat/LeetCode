class Solution {
    public int maxDepth(String s) {
        int count = 0 , max = -1;
        for(int i =0 ; i< s.length() ; i++){
            if(s.charAt(i) == '(') count++;
            else if (s.charAt(i) == ')')count--;
            if(max < count) max = count;
        }
        return max;
    }
}