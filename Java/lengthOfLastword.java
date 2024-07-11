class Solution {
    public int lengthOfLastWord(String s) {
        int track = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(Character.isWhitespace(s.charAt(i)) && track < 1){
                continue;
            }
            if(Character.isAlphabetic(s.charAt(i))){
                track++;
            }else{
                break;
            }
        }
        return track;
    }
}