class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i =0;i<rowIndex;i++){
           List<Integer> newlist = new ArrayList<Integer>();
           newlist.add(1);
           for(int j =1; j < list.size() ; j++){
               newlist.add(list.get(j-1) + list.get(j));
           }
           newlist.add(1);
           list = newlist;
        }
        return list;
    }
}