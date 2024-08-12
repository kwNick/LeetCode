/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
    if (x <= 0 || x % 10 == 0) {
        return false;
    }
    var comp = 0;
    while (x > comp) {
        comp = comp * 10 + x % 10;
        x /= 10;
    }

    return x == comp || x == comp / 10;
};