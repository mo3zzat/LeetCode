class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        Set<Integer> st = new HashSet<>();
        for(int num : arr){
            mp.put(num, mp.getOrDefault(num,1) + 1);
        }
        for(int num : mp.keySet()){
            st.add(mp.get(num));
        }
        return st.size() == mp.size();
    }
}