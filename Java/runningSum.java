class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = nums.length-1; i > 0; i--){
            for(int j = i-1; j > -1; j--){
                nums[i] += nums[j];
            }
        }
        return nums;
    }

    public int[] runningSum_2(int[] nums) { //faster than above - the current element plus the running sum of the preceding element
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}