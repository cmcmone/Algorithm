/*
 * @lc app=leetcode id=35 lang=java
 * @version 1.00 May 29, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [35] Search Insert Position
 * - https://leetcode.com/problems/search-insert-position/
 * 
 * Approach 1: O(n)
 * Approach 2: Binary Search O(log(n))
 */

// @lc code=start
/*
//Approach 1: O(n)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && nums[i] < target) {
            i++;
        }
        return i;
    }
}
*/
//Approach 2: Binary Search
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || nums[0] > target) return 0;
        if (nums[nums.length - 1] < target) return nums.length;

        int right = 0, left = nums.length - 1;
        int mid = 0;
        while (right < left) {
            mid = left + (right - left)/2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                left = mid -1;
            if (nums[mid] < target)
                right = mid + 1;
        }
        return nums[left] < target ? left + 1: left;
    }
}
// @lc code=end

