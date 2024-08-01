class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int track = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[track] = nums[i];
                track++;
            }
        }
        return track;
    }
}

class Solution_2 {
    public int removeDuplicates(int[] nums) {
        int track = 0; 
        for(int i = 1; i < nums.length; i++){
            if(nums[track] != nums[i]){
                track++;
                nums[track] = nums[i];
            }
        }
        return track+1;
    }
}