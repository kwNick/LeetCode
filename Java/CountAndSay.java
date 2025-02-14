class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String s = "1";
        for(int j = 0; j < n - 1; j++){
            StringBuilder ans = new StringBuilder();
            int len = s.length();
            for(int i = 0; i < len; i++){
                int count = 1;
                while(i < len-1 && s.charAt(i) == s.charAt(i+1)){ count++; i++;}
                ans.append(count).append(s.charAt(i));
            }
            s = ans.toString();
        }
        return s;
    }
}