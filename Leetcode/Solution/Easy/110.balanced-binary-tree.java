/*
 * @lc app=leetcode id=110 lang=java
 * @version 1.00 June 12, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [110] Balanced Binary Tree
 * - https://leetcode.com/problems/balanced-binary-tree/
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        
        int leftHeight = helper(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = helper(root.right);
        if (rightHeight == -1) return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
// @lc code=end

