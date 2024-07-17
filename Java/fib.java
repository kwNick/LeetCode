class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        int sum = 1;
        int second = 1;
        int third = 1;
        for(int i = 3; i <= n; i++){
            sum = second + third;
            third = second;
            second = sum;
        }
        return sum;
    }
}