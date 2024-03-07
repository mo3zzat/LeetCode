class Solution {
    public String destCity(List<List<String>> paths) {
        if(paths.size()==1)
            return paths.get(0).get(1);
        Set<String> st = new HashSet<>();
        for(List<String> path : paths){
            st.add(path.get(0));
        }
        for(List<String> path : paths){
            if(!st.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }
}