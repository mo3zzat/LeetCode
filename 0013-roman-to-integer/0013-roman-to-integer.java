class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int nums=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I' : nums = 1;break;
                case 'V' : nums = 5;break;
                case 'X' : nums = 10;break;
                case 'L' : nums = 50;break;
                case 'C' : nums = 100;break;
                case 'D' : nums = 500;break;
                case 'M' : nums = 1000;break;
                 
            }

            if(nums >= prev){
                ans += nums;
            }else{
                ans -= nums;
            }
            prev = nums;
        }
        return ans;
    }
}