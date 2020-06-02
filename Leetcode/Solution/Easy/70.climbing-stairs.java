/*
 * @lc app=leetcode id=70 lang=java
 * @version 1.00 June 1, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [70] Climbing Stairs
 * - https://leetcode.com/problems/climbing-stairs/
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n < 4) return n;
        int a = 3, b = 2;
        int res = 0;
        for (int i = 4; i <= n; i++) {
            res = a + b;
            b = a;
            a = res;
        }
        return res;
    }
}
// @lc code=end

