class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        // double k = celsius+273.15;
        // double F = celsius*1.80+32.00;
        arr[0] = celsius + 273.15;
        arr[1] = celsius * 1.80 + 32.00;
        return arr;
    }

    public double[] convertTemperature_2(double celsius) {
        double[] arr = { celsius + 273.15, celsius * 1.80 + 32.00 };
        // double k = celsius+273.15;
        // double F = celsius*1.80+32.00;
        // arr[0] = celsius+273.15;
        // arr[1] = celsius*1.80+32.00;
        return arr;
    }
}