class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[] {(double)(celsius + 273.15) ,(double)( (celsius * 1.80) +32.00)};
    }
}