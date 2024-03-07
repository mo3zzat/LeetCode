class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length == 1) return 1;
        int sm = 0;
        for(int i = 0 ; i<points.length - 1;i++){
            sm += Math.max(Math.abs(points[i][0] - points[i+1][0]) , Math.abs(points[i][1] - points[i+1][1]));
        }
        return sm;
    }
}