class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int one = word1.length();
        int two = word2.length();
        int i = 0;
        while(i < one && i < two){
            res = res.concat((word1.charAt(i)+"".concat(word2.charAt(i)+"")));
            i++;
        }
        res = res.concat(word1.substring(i));
        res = res.concat(word2.substring(i));
        return res;
    }

    public String mergeAlternately_2(String word1, String word2) { //Faster than above
        StringBuilder res = new StringBuilder();
        int one = word1.length();
        int two = word2.length();
        int i = 0, j= 0;
        while(i < one || j < two){
            if(i < one)
                res.append(word1.charAt(i++));
            if(j < two)
                res.append(word2.charAt(j++));
        }
        return res.toString();
    }
}