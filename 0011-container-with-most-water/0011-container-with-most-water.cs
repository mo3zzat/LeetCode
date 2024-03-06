public class Solution {
    public int MaxArea(int[] height) {
        int first = 0 , end = height.Length - 1;
                int max = int.MinValue ;
                while(first < end)
                {
                    int width = end - first;
                    int heigth = Math.Min(height[end], height[first]);
                    max = Math.Max(max, (width  * heigth));
                    if (height[end] >= height[first]) 
                        first++;
                    
                    else
                    
                        end--;
                    
                }
                return max;
    }
}