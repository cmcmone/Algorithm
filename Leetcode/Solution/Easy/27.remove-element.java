/*
 * @lc app=leetcode id=27 lang=java
 * @version 1.00 May 27, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [27] Remove Element
 * - https://leetcode.com/problems/remove-element/
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int pos = 0, len = nums.length;
        while (pos < len) {
            if (nums[pos] == val) {
                nums[pos] = nums[len - 1];
                len--;
            } else {
                pos++;
            }
        }
        return pos;
    }
}
// @lc code=end
