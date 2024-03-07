public class Solution {

    public int Reverse(int x) {
        int negative = 1;
        int result = 0;
        
        if (x < 0)
        {
            negative = -1;
            x *= -1;
        }
        
        int maxVal = int.MaxValue / 10;
        
        
        while (x > 0)
        {   
            if (result > maxVal) return 0;
            
            result = result * 10 + x % 10;
            
            x = x / 10;
            
            if (result < 0)
                return 0;
        }
        
        return result * negative;
        
    }
}