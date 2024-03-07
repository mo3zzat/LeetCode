public class Solution {
    public string ReverseWords(string s) {
        string[] str = s.Split(' ' , StringSplitOptions.RemoveEmptyEntries);
        int l = 0; int r = str.Length - 1;
        while (l <= r)
        {
            if (!(str[l] == " " || str[r] == " "))
            {
                string st = str[r];
                str[r] = str[l];
                str[l] = st;
                r--; l++;
            }
        }

        return string.Join(" ", str);
    }
}