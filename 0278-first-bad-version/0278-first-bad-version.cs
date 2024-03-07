/* The isBadVersion API is defined in the parent class VersionControl.
      bool IsBadVersion(int version); */

public class Solution : VersionControl {
    public int FirstBadVersion(int n) {
        int h = 1;
        int l = n;
        while(h < l){
            int m = h + (l-h) / 2;
            if(IsBadVersion(m))
                l = m;
            else  
                h = m + 1;
        }
        return h;
    }
}