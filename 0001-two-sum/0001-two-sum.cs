public class Solution {
     public int[] TwoSum(int[] nums, int target) {
        int sum = 0 , x = 0;
                int[] indexs = new int[2];
                for (int i = 0; i < nums?.Length; i++)
                {
                    x = 0;
                    sum = nums[i];
                    indexs[x] = i;
                        for(int j = i+1 ; j < nums.Length; j++)
                        {

                            if (nums[i] + nums[j] == target)
                            {
                                indexs[0] = i;
                                indexs[1] = j;
                                return indexs;
                            }
                        }


                }
                return null;
    }
}