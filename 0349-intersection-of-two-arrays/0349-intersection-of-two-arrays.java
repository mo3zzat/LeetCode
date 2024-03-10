class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> st = new HashSet<>();
        int i=0,j=0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]) {
                st.add(nums1[i]);
                i++;j++;
            }
            else if (nums1[i] > nums2[j]){
                j++;
            }else 
                i++;
        }
        int[] res = new int[st.size()];
        i = 0;
        for(int n : st){
            res[i++] = n;
        }
        return res;
    }
}