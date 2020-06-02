/*
 * @lc app=leetcode id=88 lang=java
 * @version 1.00 June 1, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [88] Merge Sorted Array
 * - https://leetcode.com/problems/merge-sorted-array/
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int k = m-- + n-- - 1; k >= 0; --k) {
            if (n < 0) break;
            if (m < 0) {
                nums1[k] = nums2[n--];
            } else {
                nums1[k] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            }
        }
    }
}
// @lc code=end

