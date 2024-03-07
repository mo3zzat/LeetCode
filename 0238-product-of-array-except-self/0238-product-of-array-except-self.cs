public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] result = new int[nums.Length];
 int product = 1 , product1 = 1 , cnt0 = 0;
 for (int i = 0; i < nums.Length; i++)
 {
     if (nums[i] != 0)
     {
         product *= nums[i];
     }
     else
         cnt0++;
     product1 *= nums[i];
 }
 for(int i = 0; i < nums.Length; i++)
 {
     if(cnt0 > 1)
     {
         result[i] = 0;
     }else if(product != product1 && nums[i] == 0)
     {
         result[i] = product;
     }else
     {
         result[i] = product1 / nums[i];
     }
 }
 return result;
    }
}