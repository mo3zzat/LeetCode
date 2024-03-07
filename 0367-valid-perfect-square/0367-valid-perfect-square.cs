public class Solution {
    public bool IsPerfectSquare(int num) {
       if (num == 1)
    return true;

var l = 1;
var r = num / 2;

while (l <= r)
{
    var m = (l + r) / 2;
    var sqrt = num / (float)m;

    if (m == (num / m) && (num%m) == 0)
        return true;

    if (sqrt < m)
        r = m - 1;
    else
        l = m + 1;
}

return false;
    }
}