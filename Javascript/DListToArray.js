/**
 * // Definition for a _Node.
 * function _Node(val,prev,next) {
 *    this.val = val;
 *    this.prev = prev;
 *    this.next = next;
 * };
 */

/**
 * @param {_Node} head
 * @return {number[]}
 */
var toArray = function (head) {
    let arr = [];
    let tmp = head;
    while (tmp) {
        arr.push(tmp.val);
        tmp = tmp.next;
    }
    return arr;
};