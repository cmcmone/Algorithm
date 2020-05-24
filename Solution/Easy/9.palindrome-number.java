/*
 * @lc app=leetcode id=9 lang=java
 * @version 1.00 May 23, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [9] Palindrome Number 
 * https://leetcode.com/problems/palindrome-number/
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int res = 0, org = x;
        while (x > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res == org;
    }
}
// @lc code=end

