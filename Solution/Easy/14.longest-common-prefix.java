import java.util.ArrayList;

/*
 * @lc app=leetcode id=14 lang=java
 * @version 1.00 May 24, 2020
 * @author Ray Chen
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String res = "";
        boolean include = false;
        int i = 0;
        while (i < strs[0].length()) {
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length() && strs[0].charAt(i) == strs[j].charAt(i)) {
                    include = true;
                } else {
                    include = false;
                    return res;
                }
            }
            if (include) {
                res += strs[0].charAt(i);
                include = false;
            }
            i++;
        }
        return res;
    }
}
// @lc code=end

