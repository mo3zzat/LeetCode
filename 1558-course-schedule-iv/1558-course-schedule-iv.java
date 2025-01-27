class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] relations = new boolean[numCourses][numCourses];
        for(int[] d : prerequisites){
            relations[d[0]][d[1]] = true;
        }
        for(int i = 0; i<numCourses;i++){
            for(int src = 0; src < numCourses;src++){
                for(int target = 0; target < numCourses; target++){
                    relations[src][target] = relations[src][target] || (relations[src][i] && relations[i][target]);
                }
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int[] d : queries){
            res.add(relations[d[0]][d[1]]);
        }
        return res;
    }
}