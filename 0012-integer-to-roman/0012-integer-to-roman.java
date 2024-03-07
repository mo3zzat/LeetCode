class Solution {
    public String intToRoman(int num) {
        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hrns = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] ths={"","M","MM","MMM"};
        StringBuilder sb = new StringBuilder(ths[num/1000]);
        sb.append(hrns[(num%1000)/100]);
        sb.append(tens[(num%100)/10]);
        sb.append(ones[(num%10)]);
        return sb.toString();
    }
}