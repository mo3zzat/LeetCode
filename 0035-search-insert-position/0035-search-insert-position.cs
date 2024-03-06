public class Solution {
   public int SearchInsert(int[] nums, int target) {
         int start = 0;
                int end = nums.Length - 1;
                char ch = ' ';
                while(start <= end)
                {
                    int mid = start + (end - start) / 2;
                    if (nums[mid] == target)
                        return mid;
                    else if (nums[mid] > target)
                    {
                        end = mid - 1;
                        if (ch != ' ') ch = 'l';
                    }
                    else
                    {
                        start = mid + 1;
                        if (ch != ' ') ch = 'r';
                    }

                }
                if(ch == 'r')
                    end = start + (end - start -1) / 2;
                else
                    start =  (end + start) / 2;

                while(start <= end)
                {
                    int mid = start + (end - start) / 2;
                    if (mid < nums.Length-1 && mid >= 0 && nums[mid] < target && nums[mid+1] >      target)
                        return mid + 1;
                    else if (nums[mid] > target)
                    {
                        end = mid - 1;
                    }
                    else
                    {
                        start = mid + 1;
                    }
                }
                if (nums[nums.Length-1] < target )
                    return nums.Length;
                else 
                    return 0;
    }
}