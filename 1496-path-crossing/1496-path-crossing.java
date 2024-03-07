class Solution {
    public boolean isPathCrossing(String path) {
        Set<List<Integer>> st = new HashSet<>();
        int x = 0 , y = 0;
        st.add(Arrays.asList(x , y));
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if(ch == 'N') y++;
            if(ch == 'S') y--;
            if(ch == 'E') x++;
            if(ch == 'W') x--;

            if(st.contains(Arrays.asList(x , y))) return true;
            else st.add(Arrays.asList(x , y));
        }
        return false;
    }
}