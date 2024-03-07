class Solution {
        class Node {
            int x;
            int y;

            public Node(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Node node = (Node) o;
                return x == node.x && y == node.y;
            }

            @Override
            public int hashCode() {
                return Objects.hash(x, y);
            }
        }

        class UF {
            Node[][] parent;
            int[][] size;

            public UF(int[][] grid) {
                int row = grid.length;
                int col = grid[0].length;

                this.parent = new Node[row][col];
                this.size = new int[row][col];

                for (int i = 0; i < row; i += 1) {
                    for (int j = 0; j < col; j += 1) {
                        if (grid[i][j] == 1) {
                            size[i][j] = 1;
                            parent[i][j] = new Node(i, j);
                        }
                    }
                }
            }

            public Node findParent(Node child) {
                int xC = child.getX();
                int yC = child.getY();

                int cacheXC;

                while (!(xC == parent[xC][yC].getX() && yC == parent[xC][yC].getY())) {
                    cacheXC = xC;

                    xC = parent[xC][yC].getX();
                    yC = parent[cacheXC][yC].getY();
                }

                return new Node(xC, yC);
            }

            public void union(Node x, Node y) {
                Node pX = this.findParent(x);
                Node pY = this.findParent(y);

                if (pX.equals(pY)) {
                    return;
                }

                if (this.size[pX.getX()][pX.getY()] > this.size[pY.getX()][pY.getY()]) {
                    this.size[pX.getX()][pX.getY()] += this.size[pY.getX()][pY.getY()];
                    this.parent[pY.getX()][pY.getY()] = pX;
                    return;
                }

                this.size[pY.getX()][pY.getY()] += this.size[pX.getX()][pX.getY()];
                this.parent[pX.getX()][pX.getY()] = pY;
            }

            public int findConnectedComponentWithMaxArea() {
                Map<Node, Integer> m = new HashMap<>();
                int max = 0;

                for (Node[] nodes : parent) {
                    for (int j = 0; j < parent[0].length; j += 1) {
                        if (nodes[j] != null) {
                            Node key = this.findParent(nodes[j]);

                            if (!m.containsKey(key)) {
                                m.put(key, 0);
                            }

                            int curr = m.get(key);

                            m.put(key, curr + 1);
                            max = Math.max(max, curr + 1);
                        }
                    }
                }

                return max;
            }
        }

        public int maxAreaOfIsland(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            UF uf = new UF(grid);

            for (int i = 0; i < row; i += 1) {
                for (int j = 0; j < col; j += 1) {

                    if (grid[i][j] == 0) {
                        continue;
                    }

                    if (i + 1 < row && grid[i + 1][j] == 1) {
                        uf.union(new Node(i, j), new Node(i + 1, j));
                    }

                    if (j + 1 < col && grid[i][j + 1] == 1) {
                        uf.union(new Node(i, j), new Node(i, j + 1));
                    }

                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        uf.union(new Node(i, j), new Node(i - 1, j));
                    }

                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        uf.union(new Node(i, j), new Node(i, j - 1));
                    }

                }
            }

            return uf.findConnectedComponentWithMaxArea();
        }
}