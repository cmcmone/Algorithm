/*
 * @lc app=leetcode id=14 lang=java
 * @version 1.04 May 24, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [14] Longest Common Prefix https://leetcode.com/problems/longest-common-prefix/
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        
        int len = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (len > strs[i].length()) {
                len = strs[i].length();
            }
        }
        var res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return res.toString();
                }
            }
            res.append(strs[0].charAt(i)); 
        }
        return res.toString();
    }
}
// @lc code=end

