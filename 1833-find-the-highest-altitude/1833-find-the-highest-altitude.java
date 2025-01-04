class Solution {
    public int largestAltitude(int[] gain) {
        int mx = Math.max(0,gain[0]);
        for(int i = 1; i < gain.length;i++){
            gain[i] += gain[i-1];
            mx = Math.max(mx,gain[i]);
        }
        return mx;
    }
}