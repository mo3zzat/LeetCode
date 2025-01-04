class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for(int num : nums1) h1.add(num);
        for(int num : nums2){
                h2.add(num);
        }
        for (int n : nums2) {
            if (h1.contains(n)) {
                h1.remove(n);
                h2.remove(n);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(h1));
        res.add(new ArrayList<>(h2));
        return res;
    }
}