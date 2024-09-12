/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function (word1, word2) {
    return [...Array(Math.max(word1.length, word2.length))].map((_, idx) => (word1[idx] || "") + (word2[idx] || "")).join("");
};