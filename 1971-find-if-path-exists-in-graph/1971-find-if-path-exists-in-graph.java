class Solution {
    public class QuickUnion{
        private int[] parent;
        private int[] size;
        public QuickUnion(int n){
            parent = new int[n];
            size = new int[n];
            for (int i = 0 ;i < n ;i++){
                parent[i] = i;
            }
            Arrays.fill(size , 1);
        }
        private int root(int i){
            while (parent[i] != i){
                parent[i] = parent[parent[i]];
                i = parent[i];
            }
            return parent[i];
        }
        private int find(int i){
            int max = i;
            while (i != parent[i]){
                max = Math.max(max , parent[i]);
                i = parent[i];
            }
            return max;
        }
        public void connect(int p, int q) {
            int i = root(p);
            int j = root(q);
            if(i == j) return;
            if(size[i] > size[j]){
                parent[j] = i;
                size[i] += size[j];
            }else{
                parent[i] = j;
                size[j] += size[i];
            }
        }
        public boolean isConnected(int p, int q) {
            int i = root(p);
            int j = root(q);
            return i == j;
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        QuickUnion qu = new QuickUnion(n);
        for(int[] row : edges){
            qu.connect(row[0] , row[1]);
        }
        return qu.isConnected(source , destination);
    }
}