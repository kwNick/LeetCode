class Solution {
    public boolean isArmstrong(int n) {
        int num = n;
        int sum = 0;
        int k = String.valueOf(n).length();
        while (num > 0) {
            sum += Math.pow(num % 10, k);
            num = num / 10;
        }
        return sum == n;
    }

    public boolean isArmstrong_2(int n) { // takes a little bit more space than above
        int num = n;
        int sum = 0;
        int k = countDigs(n);
        while (num > 0) {
            sum += Math.pow(num % 10, k);
            num = num / 10;
        }
        return sum == n;
    }

    int countDigs(int n) {
        return (int) Math.log10(n) + 1;
    }
}