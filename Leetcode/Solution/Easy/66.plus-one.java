/*
 * @lc app=leetcode id=66 lang=java
 * @version 1.00 May 31, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [66] Plus One
 * - https://leetcode.com/problems/plus-one/
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] + 1 < 10) {
                digits[i] = digits[i] + 1;
                break;
            }
            digits[i] = digits[i] + 1;
            digits[i] = digits[i] % 10;
            if (i == 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
        }
        return digits;
    }
}
// @lc code=end
