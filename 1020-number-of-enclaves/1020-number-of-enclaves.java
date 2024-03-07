public class Solution{
    public class UnionFind {
        private int[] parent;
        private int[] rank;
        private boolean[] onEdge;

        public UnionFind(int[][] grid){
            int m = grid.length;
            int n = grid[0].length;

            parent = new int[m*n];
            rank = new int[m*n];
            onEdge = new boolean[m*n];

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(grid[i][j] == 1){
                        int index = i*n+j;
                        parent[index] = index;
                        if(i==0 || i==m-1 || j==0 || j==n-1){
                            onEdge[index] = true;
                        }
                    }
                }
            }
        }
        public int find(int p){
            while (parent[p] != p){
                p = find(parent[p]);
            }
            return p;
        }
        public void union(int p, int q){
            int rootX = find(p);
            int rootY = find(q);

            if(rootX!=rootY){
                if (rank[rootX] > rank[rootY]) {
                    parent[rootY] = rootX;
                    onEdge[rootX] |= onEdge[rootY];
                } else if (rank[rootX] < rank[rootY]) {
                    parent[rootX] = rootY;
                    onEdge[rootY] |= onEdge[rootX];
                } else {
                    parent[rootY] = rootX;
                    onEdge[rootX] |= onEdge[rootY];
                    rank[rootX]++;
                }
            }
        }
        public boolean onEdge(int i){
            return onEdge[find(i)];
        }
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        UnionFind uf = new UnionFind(grid);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    int ind = i*n+j;
                    if(j+1<n && grid[i][j+1]==1){
                        uf.union(ind , ind+1);
                    }
                    if (i + 1 < m && grid[i + 1][j] == 1) {
                        uf.union(ind, ind + n);
                    }
                }
            }
        }
        int enclaves = 0;

        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 1 && !uf.onEdge(i * n + j)) {
                    enclaves++;
                }
            }
        }
        return enclaves;
    }

    /*public static void main(String[] args){
        Solution s = new Solution();
        int[][] a = {{0,0,0,0} , {1,0,1,0} , {0,1,1,0} ,{0,0,0,0}};
        System.out.println(s.numEnclaves(a));
    }*/
}