public class Solution {
    public int RemoveElement(int[] nums, int val) {
        int tj = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] != val)
                {
                    nums[tj++] = nums[i];
                }
            }
            Array.Resize(ref nums, tj);
            return tj;
    }
}