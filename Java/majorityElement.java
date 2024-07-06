class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for(int n = 0; n < nums.length; n++){
            if(count == 0){
                candidate = nums[n];
            }
            count += (nums[n]== candidate) ? 1 : -1;
        }
        return candidate;
    }
}