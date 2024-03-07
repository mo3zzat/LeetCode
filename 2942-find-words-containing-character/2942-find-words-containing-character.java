class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].indexOf(x) >= 0)
                lst.add(i);
        }
        return lst;
    }
}