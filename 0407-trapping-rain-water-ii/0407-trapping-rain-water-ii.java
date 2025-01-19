class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length , n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] dirt = {{0,1},{0,-1},{1,0},{-1,0}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i = 0; i < m;i++){
            for (int j = 0; j < n; j++){
                if(i==0 || i==m-1 || j==0 || j==n-1) {
                    pq.add(new int[]{heightMap[i][j], i, j});
                    visited[i][j] = true;
                }
            }
        }
        int waterVolume=0;
        while (!pq.isEmpty()){
            int[] ar = pq.poll();
            int cv = ar[0];
            int cr = ar[1];
            int cc = ar[2];

            for(int[] dir : dirt){
                int nr = cr + dir[0];
                int nc = cc + dir[1];

                if(nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]){
                    if(cv - heightMap[nr][nc] > 0){
                        waterVolume += cv - heightMap[nr][nc];
                        pq.add(new int[] {cv,nr,nc});
                    }else{
                        pq.add(new int[]{heightMap[nr][nc], nr, nc});
                    }
                      visited[nr][nc] = true;

                }
            }
        }
        return waterVolume;
    }
}