class Solution {
    private boolean isVowel(char c){
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
            return true;
        return false;
    }

    private void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        List<Integer> lst = new ArrayList<>();
        int cnt = 0;
        int n = s.length();
        for(int i = 0; i<s.length(); i++){
            if(isVowel(c[i])){
                cnt++;
               lst.add(i);
            }
        }
        if(cnt <= 1)
            return s;
        else{
            int i = 0, j = lst.size();
            while (! lst.isEmpty() && lst.size() > 1){
                i = lst.remove(0);
                j = lst.remove(lst.size()-1);
                swap(c,i,j);
            }
        }
        return new String(c);
    }
}