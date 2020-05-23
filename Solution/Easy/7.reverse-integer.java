/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long res = 0;
        if (x == 0) {
            return 0;
        }
        else {
            while (x != 0) {
                res *= 10;
                res += x % 10;
                x /= 10;
            }
        }
        return ((res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int) res);
    }
}
// @lc code=end

