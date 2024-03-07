class Solution {
    public  boolean isVowel(char c){
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
                return true;
        }
        return false;
    }
    public String sortVowels(String s) {
        ArrayList<Character> vow = new ArrayList<>();
        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                vow.add(c);
            }
        }
        int j = 0;
        StringBuilder sb = new StringBuilder();
        vow.sort(Comparator.naturalOrder());
        for(int i = 0 ; i<s.length();i++){
            if(isVowel(s.charAt(i))){
                sb.append(vow.get(j++));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}