/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    const map = new Map();
    for (var i = 0; i < nums.length; i++) {
        const comp = target - nums[i];
        if (map.has(comp)) {
            return [map.get(comp), i];
        }
        map.set(nums[i], i);
    }
    return [];
};