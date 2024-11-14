
class Solution {

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int dig = x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && dig > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && dig < -8)) {
                return 0;
            }
            res = res * 10 + dig;
        }
        return res;
    }
}
