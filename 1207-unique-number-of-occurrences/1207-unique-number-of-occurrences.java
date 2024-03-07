class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0 ;i < arr.length  ; i++){
            int cnt = 1;
            while (i + 1 < arr.length && arr[i] == arr[i+1]  ){
                cnt++;
                i++;
            }
            if(ls.contains(cnt)){
                return false;
            }
            ls.add(cnt);

        }
        return true;
    }
}