/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var multiply = function (num1, num2) {
    return (parseInt(num1, 10) * parseInt(num2, 10)).toString();
}

//parse each argument to a base 10 number and then use toString method to return a string of the multiplied value