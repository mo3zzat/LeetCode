class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int area = -1;
        int minH = -1;
        while (i < j){
            minH = Math.min(height[i],height[j]);
            area = Math.max(area, minH * (j-i));
            while (i < j && height[i] <= minH)
                i++;
            while (i < j && height[j] <= minH)
                j--;
        }
        return area;
    }
}