/*
 * @lc app=leetcode id=69 lang=java
 * @version 1.00 June 1, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [69] Sqrt(x)
 * - https://leetcode.com/problems/sqrtx/
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int low = 1, hight = x;
        int mid;
        while (low < hight) {
            mid = low + (hight - low) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                hight = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1))
                    return mid;
                low = mid + 1;
            }
        }
        return low;
    }
}
// @lc code=end

