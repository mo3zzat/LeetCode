class Solution {
    private int countPoint(int[][] points , int[] query){
        int cnt = 0;
        int centerX = query[0] ,  centerY = query[1] , radius = query[2];
        for(int[] point : points ){
            if((centerX - point[0]) * (centerX - point[0]) +  (centerY - point[1]) * (centerY - point[1]) <= radius * radius)
                cnt++;
        }
        return cnt;
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
            res[i] = countPoint(points , queries[i]);
        }
        return res;   
    }
}