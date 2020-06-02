import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=101 lang=java
 * @version 1.00 June 2, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [101] Symmetric Tree
 * - https://leetcode.com/problems/symmetric-tree/
 * 
 * Approach 1: recursively 
 * Approach 2: iteratively
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

//Approach 1: recursively 
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
/*
//Approach 2: iteratively
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return root == null;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode left = root.left, right = root.right;
        s.push(left);
        s.push(right);
        while(!s.empty()) {
            right = s.pop();
            left = s.pop();
            if (left == null && right == null) {
                continue; 
            }
            if (left == null || right == null) {
                return false; 
            }
            if (right.val != left.val) {
                return false;
            }
            s.push(left.left);
            s.push(right.right);
            s.push(left.right);
            s.push(right.left);
        }
        return true;
    }
}
*/
// @lc code=end
