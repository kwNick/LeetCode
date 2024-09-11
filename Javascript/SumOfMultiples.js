/**
 * @param {number} n
 * @return {number}
 */
var sumOfMultiples = function (n) {
    return [...Array(n + 1)].reduce((acc, _, idx) => acc += !(idx % 3) || !(idx % 5) || !(idx % 7) ? idx : 0, 0);
};