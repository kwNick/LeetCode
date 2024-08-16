class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0; i < s.length()-1; i++){
            sum += Math.abs(((int) s.charAt(i) - (int) s.charAt(i+1)));
        }
        return sum;
    }

    private int abs(int val){
        if(val < 0){
            return val*-1;
        }
        return val;
    }
    public int scoreOfString_2(String s) {
        int sum = 0;
        for(int i = 0; i < s.length()-1; i++){
            sum += abs((s.charAt(i) - s.charAt(i+1)));
        }
        return sum;
    }
}