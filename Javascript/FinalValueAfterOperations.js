/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function (operations) {
    return operations.reduce((acc, cur) => acc += (cur.includes("+") ? 1 : -1), 0);
};