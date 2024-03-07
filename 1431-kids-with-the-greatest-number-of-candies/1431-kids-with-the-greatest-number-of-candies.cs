public class Solution {
    public IList<bool> KidsWithCandies(int[] candies, int extraCandies) {
        IList<bool> ret = new List<bool>();
int max = candies.Max();
for(int i = 0;i < candies.Length; i++)
{
    if ((candies[i] + extraCandies) >= max)
        ret.Add(true);
    else ret.Add(false);
}
return ret;
    }
}