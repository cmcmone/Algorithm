/*
 * @lc app=leetcode id=27 lang=java
 * @version 1.00 May 27, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [27] Remove Element
 * - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int pos = 0, len = nums.length - 1;
        while (pos <= len) {
            if (nums[pos] == val) {
                while (len >= 0) {
                    if (nums[len] != val) {
                        nums[pos] = nums[len--];
                        break;
                    } else {
                        len--;
                    }
                }
            } else {
                pos++;
            }
        }
        return pos;
    }
}
// @lc code=end

