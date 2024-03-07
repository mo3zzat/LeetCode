public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
        int sum = 0 , x = 0;
                int[] indexs = new int[2];
                for (int i = 0; i < numbers?.Length; i++)
                {
                    x = 0;
                    sum = numbers[i];
                    indexs[x] = i;
     
                        for(int j = i+1 ; j < numbers.Length; j++)
                        {
                       
                            if (numbers[i] + numbers[j] == target)
                            {
                                int[] aa =  { i+1, j+1  };
                                return aa;
                            }
                        }


                }
                return null;
    }
}