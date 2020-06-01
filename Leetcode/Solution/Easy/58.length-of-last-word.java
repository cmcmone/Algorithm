/*
 * @lc app=leetcode id=58 lang=java
 * @version 1.00 May 31, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [58] Length of Last Word
 * - https://leetcode.com/problems/length-of-last-word/
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length() - 1;
        while (len >= 0 && s.charAt(len) == ' ') {
            len--;
        }
        for (int i = len; i >= 0; --i) {
            if (s.charAt(i) == ' ') {
                return len - i;
            }
            if (i == 0) {
                return ++len;
            }
        }
        return 0;
    }
}
// @lc code=end

