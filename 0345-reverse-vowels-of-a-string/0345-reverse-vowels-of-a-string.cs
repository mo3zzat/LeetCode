public class Solution {
    public string ReverseVowels(string s) {
         string vowel = "aeiouAEIOU";
 int l = 0, r = s.Length - 1;
 char[] rst = s.ToCharArray();
 while(l < r)
 {
     if (vowel.Contains(s[l]) && vowel.Contains(s[r]))
     {

         char c = s[l];
         rst[l] = s[r];
         rst[r] = c;
         r--;
         l++;
     }else if (vowel.Contains(s[l]) && !vowel.Contains(s[r]))
     {
         r--;
     }
     else
     {
         l++;
     }
 }
 string rs = new string(rst);
 return rs;
    }
}