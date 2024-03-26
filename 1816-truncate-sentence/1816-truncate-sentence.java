class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        if(k > arr.length) return s;
        else if (k == 0) return new String();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<k;i++){
            sb.append(arr[i]);
            if(i != k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}