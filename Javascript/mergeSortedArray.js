/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
    var r1 = m - 1;
    var r2 = n - 1;
    for (var i = m + n - 1; i >= 0; i--) {
        if (r1 >= 0 && r2 >= 0) {
            nums1[i] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
        } else if (r1 >= 0) {
            nums1[i] = nums1[r1--];
        } else {
            nums1[i] = nums2[r2--];
        }
    }
    return;
};