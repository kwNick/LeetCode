
class Solution {

    public int maxAreaBruteForce(int[] height) { //BruteForce Approach
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int maxH = Math.min(height[i], height[j]);
                if (max < maxH * (j - i)) {
                    max = maxH * (j - i);
                }
            }
        }
        return max;
    }

    public int maxAreaTwoPointer(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right]) {
                left++; 
            }else {
                right--;
            }
        }
        return max;
    }
}
