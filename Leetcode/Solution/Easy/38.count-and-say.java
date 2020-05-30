/*
 * @lc app=leetcode id=38 lang=java
 * @version 1.00 May 29, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [38] Count and Say
 * - https://leetcode.com/problems/count-and-say/
 * 
 * Approach 1: recursive
 * Approach 2: iterative
 */

// @lc code=start
/*
//Approach 1: recursive
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
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
*/
//Approach 2: iterative
class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for (int k = 1; k < n; k++) {
            var str = new StringBuilder();
            for (int i = 0, j = 1; i < res.length(); i++, j = 1) {
                while (i < res.length() - 1 && res.charAt(i) == res.charAt(i + 1)) {
                    i++;
                    j++;
                }
                str.append(String.valueOf(j)).append(res.charAt(i));
            }
            res = str.toString();
        }
        return res;
    }
}
// @lc code=end
