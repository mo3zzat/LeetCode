class Solution {
    
    public int[] minOperations(String boxes) {
        char[] chars = boxes.toCharArray();
        int n = chars.length;
        int ans = 0, left = 0, right = 0;
        for(int i = 0; i < n; i++ ){
            if(chars[i] == '1'){
                ans += i;
                right++;
            }
        }
        int[] res = new int[n];
        res[0] = ans;
        if(chars[0] == '1'){
            right--;
            left++;
        }
        for(int i = 1; i < n ; i++){
            ans -= right;
            ans += left;
            res[i] = ans;
            if(chars[i] == '1'){
                right--;
                left++;
            }
        }
        return res;
    }
}