class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || x % 10 == 0 && x != 0){
            return false;
        }
        
        int compare = 0;
        while(x > compare){
            compare = compare*10+(x%10);
            x /= 10;
        }
        return x == compare || x == compare/10;
    }
}