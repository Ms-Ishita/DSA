/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let str = x.toString();
    let reversed = str.split("").reverse().join("");
    return reversed=== str;
    
};