class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int fin[] = new int[m+n];
        int j = 0;
        int k = 0;
        for(int i = 0; i < n+m; i++){
            if(j < m){
                if(k < n){
                    if(nums1[j] < nums2[k]){
                        fin[i] = nums1[j];
                        j++;
                    }else if(nums1[j] == nums2[k]){
                        fin[i] = nums1[j];
                        j++;
                    }else{
                        fin[i] = nums2[k];
                        k++;
                    }
                }else{
                    fin[i] = nums1[j];
                    j++;
                    }
            }else{
                if(k < n){
                    fin[i] = nums2[k];
                    k++;
                }
            }
        }
         for(int i = 0; i < m+n; i++){
             nums1[i] = fin[i];
         }
    }
}