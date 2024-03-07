public class Solution {
     public int LengthOfLongestSubstring(string s) {
       if(s == null)
            {
                return 0;
            }else
            {
                int n = 0;
                int start = 0 , end = 0 ;
                int maxlength = 0;
                HashSet<char> list = new HashSet<char>();
                while(end < s.Length)
                {
                    if (!list.Contains(s[end]))
                    {
                        list.Add(s[end]);
                        end++;
                        maxlength = Math.Max(maxlength, list.Count());
                    }else
                    {
                        list.Remove(s[start]);
                        start++;
                    }
                }
                return maxlength;
            }
    }
}
