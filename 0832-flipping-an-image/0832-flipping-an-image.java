class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0 ; i < image.length ; i++){
            int l = 0 , r = image[i].length - 1;
            while (l <= r){
                int val = (image[i][l] + 1) % 2;
                image[i][l] = (image[i][r] + 1) % 2;
                image[i][r] = val;
                l++;
                r--;
            }
        }
        return image;
    }
}