class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> mp = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0) + 1);
        }

        for(char c : order.toCharArray()){
            if(mp.containsKey(c)){
                sb.append(String.valueOf(c).repeat(Math.max(0,mp.get(c))));
                mp.remove(c);
            }
        }
        for (char c : mp.keySet()) {
            sb.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
        }
        return sb.toString();
    }
}