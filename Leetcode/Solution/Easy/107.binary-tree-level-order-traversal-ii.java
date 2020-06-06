/*
 * @lc app=leetcode id=107 lang=java
 * @version 1.00 June 3, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [107] Binary Tree Level Order Traversal II
 * - https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * 
 * Approach 1: recursively 
 * Approach 2: iteratively
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
   public List<List<Integer>> levelOrderBottom(TreeNode root) {
      var res = new LinkedList<List<Integer>>();
      if (root == null) return res;
      Queue<TreeNode> q = new LinkedList<TreeNode>();
      q.offer(root);
      while (!q.isEmpty()) {
         int size = q.size();
         var sub = new LinkedList<Integer>();
         for (int i = 0; i < size; i++) {
            if (q.peek().left != null) {
               q.offer(q.peek().left);
            }
            if (q.peek().right != null) {
               q.offer(q.peek().right);
            }
            sub.add(q.poll().val);
         }
         res.add(0, sub);
      }
      return res;
   }
}
// @lc code=end

