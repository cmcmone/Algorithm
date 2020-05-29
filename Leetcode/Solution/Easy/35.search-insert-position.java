/*
 * @lc app=leetcode id=35 lang=java
 * @version 1.00 May 29, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [35] Search Insert Position
 * - https://leetcode.com/problems/search-insert-position/
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && nums[i] < target) {
            i++;
        }
        return i;
    }
}
// @lc code=end

