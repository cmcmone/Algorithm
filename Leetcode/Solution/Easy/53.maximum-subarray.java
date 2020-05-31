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
 * Approach 3: dynamic programming
 */

// @lc code=start
/*
//Approach 1: iterative
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

//Approach 2: divide and conquer
class Solution {
    public int maxSubArray(int[] nums) {
        return maxSub(nums, 0, nums.length - 1);
    }

    private int maxSub(int[] nums, int left, int right) {
        //base case
        if (left == right) return nums[left];
        //divide
        int mid = left + (right - left) / 2;
        //conquer
        int leftSum = maxSub(nums, left, mid);
        int rightSum = maxSub(nums, mid + 1, right);
        //combine
        int crossSum = cross(nums, left, right);
        
        return Math.max(crossSum, Math.max(leftSum, rightSum));
    }

    private int cross(int[] nums, int left, int right) {
        int mid = left + (right - left) / 2;
        //left
        int leftSum = 0, leftMax = Integer.MIN_VALUE;
        for (int i = mid; i >= left; --i) {
            leftSum += nums[i];
            leftMax = Math.max(leftMax, leftSum);
        }
        //right
        int rightSum = 0, rightMax = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= right; ++i) {
            rightSum += nums[i];
            rightMax = Math.max(rightMax, rightSum);
        }
        return leftMax + rightMax;
    }
}
*/
//Approach 3: dynamic programming
class Solution {
    public int maxSubArray(int[] nums) {
        
    }
}
// @lc code=end
