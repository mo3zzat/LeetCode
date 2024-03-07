public class Solution {
    public int PeakIndexInMountainArray(int[] arr) {
        int start = 0 , end = arr.Length-1;
            while (start < end) {
                int imid = start + (end - start) / 2;
                if (arr[imid] > arr[imid - 1] && arr[imid] > arr[imid + 1])
                {
                    return imid;
                }else if (arr[imid] > arr[imid-1] && arr[imid] < arr[imid + 1])
                {
                    start = imid ;
                }
                else if(arr[imid] < arr[imid - 1] && arr[imid] > arr[imid + 1])
                {
                    end = imid ;
                }
            }
            return -1;
    }
}