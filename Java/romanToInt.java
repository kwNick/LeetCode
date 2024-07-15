class Solution {
    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }
    public int romanToInt(String s) {
        String lastSymbol = s.substring(s.length() - 1);
        int last = values.get(lastSymbol);
        int total = last;

        for(int i = s.length() - 2; i >= 0; i--){
            String symbol = s.substring(i, i+1);
            int curr = values.get(symbol);
            if(curr < last){
                total -= curr;
            }else{
                total += curr;
            }
            last = curr;
        }
        return total;
    }
}