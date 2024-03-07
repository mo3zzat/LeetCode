class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer , String> map = new HashMap<>();
        for(int i = 0; i<heights.length;i++){
            System.out.println(heights[i] + " => " + names[i]);
            map.put(heights[i],names[i]);
        }
        int j =0;
        Arrays.sort(heights);
        for(int i = heights.length - 1; i >= 0;i--){
            System.out.println(heights[i] + " => " + map.get(heights[i]));
            names[j++] = map.get(heights[i]);
        }
        return names;
    }
}