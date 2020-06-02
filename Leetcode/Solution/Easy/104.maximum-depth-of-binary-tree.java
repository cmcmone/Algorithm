/*
 * @lc app=leetcode id=104 lang=java
 * @version 1.00 June 2, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [104] Maximum Depth of Binary Tree
 * - https://leetcode.com/problems/maximum-depth-of-binary-tree/
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

//Approach 1: recursively 
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
/*
//Approach 2: iteratively
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> s = new LinkedList<TreeNode>();
        s.offer(root);
        int count = 0;
        while (!s.isEmpty()) {
            count++;
            int size = s.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = s.poll();
                if (cur.left != null) {
                    s.offer(cur.left);
                }
                if (cur.right != null) {
                    s.offer(cur.right);
                }
            }
        }
        return count;
    }
}
*/
// @lc code=end
