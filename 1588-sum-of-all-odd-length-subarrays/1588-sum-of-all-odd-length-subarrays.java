class Solution {
    public int sumOdd(int[] arr , int start , int end){
        int sum = 0;
        for(int i =start;i <end;i++){
            sum += arr[i];
        }
        return sum;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = sumOdd(arr , 0 , arr.length);
        //if(arr.length % 2 != 0) sum = sum * 2;
        int j = 3;
        while(j <= arr.length){
            for(int i =0 , k = j ; k<=arr.length ; i++ , k++){
                sum += sumOdd(arr , i , k);
            }
            j+=2;
        }
        
        return sum;
        
    }
}