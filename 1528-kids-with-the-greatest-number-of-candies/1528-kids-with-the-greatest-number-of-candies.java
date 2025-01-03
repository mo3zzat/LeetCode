class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> res = new ArrayList<>();
        for(int i = 1; i < candies.length;i++){
            max = Math.max(max,candies[i]);
        }
        for(int a : candies){
            if((a+extraCandies) >= max)
                res.add(true);
            else res.add(false);
        }
        return res;
    }
}