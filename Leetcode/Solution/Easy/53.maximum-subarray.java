/*
 * @lc app=leetcode id=53 lang=java
 * @version 1.00 May 30, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [53] Maximum Subarray
 * - https://leetcode.com/problems/maximum-subarray/
 * 
 * Approach 1: iterative
 * Approach 2: divide and conquer
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}
// @lc code=end
