/**
 * @param {number} times
 * @return {string}
 */
String.prototype.replicate = function (times) {
    var str = this;
    while (times > 1) {
        str += this;
        times--;
    }
    return str;
}