class Solution {
    public int totalMoney(int n) {
        int x = (((n % 7) + ((n/7))));
        int y = (n/7) - 1;
        int sm = 0;
        y = (n != 0) ? n/7 : 0;
        y--;
        sm += 28 * ((n / 7)) + (((y+1)*y) / 2 )* 7;
        y++;
        sm += (((x+1)*x) / 2 - ((y+1)*y) / 2);
        return sm;
    }
}