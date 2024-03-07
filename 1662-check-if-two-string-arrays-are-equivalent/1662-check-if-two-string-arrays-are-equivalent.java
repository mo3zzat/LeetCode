class Solution {
    public String concate(String[] word){
        StringBuilder conc = new StringBuilder();
        for(String s : word){
            conc.append(s);
        }
        return conc.toString();
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return concate(word1).equals(concate(word2));
    }
}