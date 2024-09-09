class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = nums.length-1; i > 0; i--){
            for(int j = i-1; j > -1; j--){
                nums[i] += nums[j];
            }
        }
        return nums;
    }
}