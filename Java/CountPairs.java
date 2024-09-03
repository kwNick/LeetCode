class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int size = nums.size();
        int cnt = 0;
        for(int i = 0; i < size-1; i++){
            int first = nums.get(i);
            for(int j=i+1; j < size; j++){
                if(first+nums.get(j) < target)
                    cnt++;
            }
        }
        return cnt;
    }
}