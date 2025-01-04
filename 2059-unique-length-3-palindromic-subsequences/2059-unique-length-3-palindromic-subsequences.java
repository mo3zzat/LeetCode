class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] R = new int[26];
        int[] L = new int[26];
        HashSet<Integer> S = new HashSet<>();
        for(int i =0; i < s.length();i++){
            R[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length();i++){
            int t = s.charAt(i) - 'a';
            R[t]--;

            for(int j = 0; j < 26; j++){
                if(L[j] > 0 && R[j] > 0)
                    S.add(26 * t + j);
            }
            L[t]++;
        }
        return S.size();
    }
}