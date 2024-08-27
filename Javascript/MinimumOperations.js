/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations = function (nums) {
    return nums.reduce((acc, cur) => cur % 3 != 0 ? acc += 1 : acc += 0, 0,);
};