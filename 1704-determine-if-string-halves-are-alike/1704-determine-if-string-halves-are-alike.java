class Solution {
    public boolean halvesAreAlike(String s) {
        int cnt1 = 0 , cnt2 = 0;
        int i = 0 , j = s.length() - 1;
        while (i < j){
            switch (s.charAt(i)){
                case 'a', 'e', 'i', 'o', 'u':
                case 'A', 'E', 'I', 'O', 'U':
                    cnt1++;
            }
            switch (s.charAt(j)){
                case 'a', 'e', 'i', 'o', 'u':
                case 'A', 'E', 'I', 'O', 'U':
                    cnt2++;
            }
            i++;
            j--;
        }
        
        return cnt1 == cnt2;
    }
}