class Solution {
    public boolean isPowerOfTwo(int n) {  //O(1) time complexity
        for(int i = 0; i < 31; i++){
            if(Math.pow(2,i) == n)
                return true;
        }
        return false;
    }
}