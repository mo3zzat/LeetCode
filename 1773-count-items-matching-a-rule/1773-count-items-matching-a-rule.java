class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0;
        if(ruleKey.equals("type")){
            c=0;
        }else if(ruleKey.equals("color")){
            c=1;
        }else{
            c=2;
        }
        int cnt=0;
        for(List<String> lst : items){
            if(lst.get(c).equals(ruleValue)){
                cnt++;
            }
        }
        return cnt;
    }
}