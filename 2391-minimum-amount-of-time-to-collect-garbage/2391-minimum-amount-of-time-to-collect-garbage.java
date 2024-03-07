class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        Map<Character , Integer> mp = new HashMap<>();
        int[] preSum = new int[travel.length + 1];
        preSum[1] = travel[0];
        for (int i = 1; i < travel.length; i++) {
            preSum[i + 1] = preSum[i] + travel[i];
        }
        int ans = 0;
        for(int i = 0 ; i < garbage.length ; i++){
            if(garbage[i].contains("M"))
                mp.put('M' , i);
            if(garbage[i].contains("P"))
                mp.put('P' , i);
            if(garbage[i].contains("G"))
                mp.put('G' , i);
            ans += garbage[i].length();
        }
        for(char c : mp.keySet())
            ans += preSum[mp.get(c)];
        return ans;
    }
}