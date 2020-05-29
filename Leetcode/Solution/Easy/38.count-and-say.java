/*
 * @lc app=leetcode id=38 lang=java
 * @version 1.00 May 29, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [38] Count and Say
 * - https://leetcode.com/problems/count-and-say/
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String prev = countAndSay(n - 1);
        var str = new StringBuilder();
        char c;
        for (int i = 0, j = 1; i < prev.length(); i++, j = 1) {
            c = prev.charAt(i);
            while (i < prev.length() - 1 && c == prev.charAt(i + 1)) {
                i++;
                j++;
            }
            str.append(String.valueOf(j) + c);
        }
        return str.toString();
    }
}
// @lc code=end
