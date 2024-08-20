class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public int[] buildArray_2(int[] nums)  {    //faster than above and better memory
        aPermutation(nums,0);

      return nums;
    }
  
  void aPermutation(int[] nums,int start){  //recursion 
      if(start<nums.length){
      int result=nums[nums[start]];
      aPermutation(nums,start+1);
      nums[start]=result;
      }
  }
}