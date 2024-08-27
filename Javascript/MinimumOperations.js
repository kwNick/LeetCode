/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations = function (nums) {
    return nums.reduce((acc, cur) => cur % 3 != 0 ? acc += 1 : acc += 0, 0,);
};


/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations_2 = function (nums) {
    let count = 0;
    for (i = 0; i < nums.length; i++) {
        if (nums[i] % 3 != 0)
            count++;
    }
    return count;
};