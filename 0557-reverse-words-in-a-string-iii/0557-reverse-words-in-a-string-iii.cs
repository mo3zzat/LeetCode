public class Solution {
    public string ReverseWords(string s) {
       string[] word = s.Split(' ');
       string[] revers = new string[word.Length];
       int i = 0;
        foreach(string str in word){
            char[] a = str.ToCharArray();
            Array.Reverse(a);
            string st = new string(a);
            revers[i++] = st ;
        }
        return string.Join(" " , revers);
    }
}