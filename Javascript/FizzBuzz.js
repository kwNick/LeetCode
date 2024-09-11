/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function (n) {
    return [...Array(n)].map((_, idx) => !((idx + 1) % 15) ? "FizzBuzz" : !((idx + 1) % 3) ? "Fizz" : !((idx + 1) % 5) ? "Buzz" : (idx + 1).toString());
};