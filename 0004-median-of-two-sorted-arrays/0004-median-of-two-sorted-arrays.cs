public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] med_array = new int[nums1.Length + nums2.Length];
            int x = 0 , y = 0 ,len = 0;
            for(int i = 0; i < med_array.Length; i++)
            {
                if (x < nums1.Length && y < nums2.Length)
                {
                    if (nums1[x] < nums2[y])
                    {
                        med_array[i] = nums1[x];
                        x++;
                    }
                    else
                    {
                        med_array[i] = nums2[y];
                        y++;
                    }
                }else if(x < nums1.Length)
                {
                    med_array[i] = nums1[x];
                    x++;
                }else if(y< nums2.Length)
                {
                    med_array[i] = nums2[y];
                    y++;
                }
            }
            len = med_array.Length / 2;
            return med_array.Length%2 == 0 ? (double)((med_array[len] + med_array[len-1]) / 2.0) : (double)(med_array[len] * 1.0);
    }
}