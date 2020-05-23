/*
 * @lc app=leetcode id=9 lang=java
 * @version 1.00 May 23, 2020
 * @author Ray Chen
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int res = 0, org = x;
        if (x == 0) {
            return true;
        } else if (x < 0 || (x % 10) == 0) {
            return false;
        } else {
            while (x != 0) {
                res = res * 10 + x % 10;
                x /= 10;
            }
            if (res == org) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

