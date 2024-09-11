/**
 * @param {string} date
 * @return {string}
 */
var convertDateToBinary = function (date) {
    return date.split("-").map((x) => Number(x).toString(2)).join("-");
};

/**
 * @param {string} date
 * @return {string}
 */
var convertDateToBinary_2 = function (date) {

    //given yyyy-mm-dd

    let [y, m, d] = date.split('-');

    return Number(y).toString(2) + "-" + Number(m).toString(2) + "-" + Number(d).toString(2)

};