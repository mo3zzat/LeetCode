public class Solution {
    public string MergeAlternately(string word1, string word2) {
      string str = "";
int i = 0;
while(i < word1.Length || i<word2.Length)
{
    if(i < word1.Length && i<word2.Length) {
        str += word1[i];
        str += word2[i];
        i++;
    }else if(i < word1.Length &&  i>=word2.Length){
        str += word1[i];
        i++;
    }
    else
    {
        str += word2[i];
        i++;
    }
}
return str;
    }
}