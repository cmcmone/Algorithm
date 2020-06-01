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
        int temp;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] + 1 < 10) {
                digits[i] = digits[i] + 1;
                break;
            }
            temp = digits[i] + 1;
            digits[i] = temp % 10;
            if (i == 0) {
                int j = 0;
                var new_digits = new int[digits.length + 1];
                new_digits[j] = 1;
                for (int num : digits) {
                    new_digits[++j] = num;
                }
                return new_digits;
            }
        }
        return digits;
    }
}
// @lc code=end
