/*
 * @lc app=leetcode id=28 lang=java
 * @version 1.00 May 27, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [28] Implement strStr()
 * - https://leetcode.com/problems/implement-strstr/
 */

// @lc code=start
//
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty()) return -1;

        int pos = 0;
        while (pos <= haystack.length() - needle.length()) {
            for (int i = needle.length() - 1; i >= 0 && haystack.charAt(pos + i) == needle.charAt(i); i--) {
                if (i <= 0) {
                    return pos;
                }
            }
            pos++;
        }
        return -1;
    }
}
// @lc code=end
