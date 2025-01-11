class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;
        if (s.length() == k) return true;
        
        int[] freq = new int[26];
        int single = 0;

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int cnt : freq){
            if(cnt % 2 == 1)
                single++;
        }
        return single <= k;
    }
}