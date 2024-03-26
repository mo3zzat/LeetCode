class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> st = new HashSet<>();
        for(char c : allowed.toCharArray()){
            st.add(c);
        }
        boolean flag;
        int cnt = 0;
        for(String s : words){
            flag = true;
            for(char c : s.toCharArray()){
                if(!st.contains(c)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                cnt++;
            }
        }
        return cnt;
    }
}