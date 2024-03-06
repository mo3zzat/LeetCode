public class Solution {
    public int RemoveDuplicates(int[] nums) {
        if(nums.Length < 2)
            {
                return nums.Length;
            }
            int tj = 1;
            for(int i = 1; i < nums.Length; i++)
            {
                if (nums[i] != nums[i-1])
                {
                    nums[tj++] = nums[i];
                }
            }
            Array.Resize(ref nums , tj);
            return tj;
    }
}