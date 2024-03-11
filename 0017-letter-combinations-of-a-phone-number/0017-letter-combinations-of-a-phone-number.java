class Solution {
    Map<Character,char[]> mp;
    List<String> res;
    StringBuilder sb;
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>(); if(digits.isEmpty()) return res;
        mp = new HashMap<>();
        sb = new StringBuilder();
        fillMap();
        dfs(0,digits);
        return res;
    }

    public void dfs(int i, String digits){
        if(i==digits.length()){
            res.add(sb.toString()); return;
        }
        char[] currString = mp.get(digits.charAt(i));
        for(char c: currString){
            sb.append(c);
            dfs(i+1,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public void fillMap(){
        mp.put('2',"abc".toCharArray());
        mp.put('3',"def".toCharArray());
        mp.put('4',"ghi".toCharArray());
        mp.put('5',"jkl".toCharArray());
        mp.put('6',"mno".toCharArray());
        mp.put('7',"pqrs".toCharArray());
        mp.put('8',"tuv".toCharArray());
        mp.put('9',"wxyz".toCharArray());
    }
}