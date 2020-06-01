/*
 * @lc app=leetcode id=67 lang=java
 * @version 1.00 June 1, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [67] Add Binary
 * - https://leetcode.com/problems/add-binary/
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;

        int x, y, carry = 0;
        var str = new StringBuilder();
        while (aLen >= 0 || bLen >= 0) {
            if (aLen >= 0) {
                x = Character.getNumericValue(a.charAt(aLen));
            } else {
                x = 0;
            }
            if (bLen >= 0) {
                y = Character.getNumericValue(b.charAt(bLen));
            } else {
                y = 0;
            }
            aLen--;
            bLen--;

            str.insert(0, (x + y + carry) % 2);
            carry = (x + y + carry) / 2;
        }

        if (carry == 1) {
            str.insert(0, "1");
        }
        return str.toString();
    }
}
// @lc code=end
