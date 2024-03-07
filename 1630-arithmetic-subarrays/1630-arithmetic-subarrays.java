class Solution {
    public boolean arithmetic(int[] arr){
        Arrays.sort(arr);
        int ans =arr[1] - arr[0];
        for(int i = 1;i< arr.length;i++){
            if(ans != arr[i] - arr[i-1]) return false;
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for(int i = 0 ; i<l.length;i++){
            int[] a = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            res.add(arithmetic(a));
        }
        return res;
    }
}