/*
 * @lc app=leetcode id=20 lang=java
 * @version 1.00 May 24, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [20] Valid Parentheses https://leetcode.com/problems/valid-parentheses/
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        char c = s.charAt(0);
        if (c == ')' || c == '}' || c == ']') return false;

        var stack = new Stack<Character>();
        stack.push(c);
        for (int i = 1; i < s.length(); i++) {
            if (!stack.empty() && isMatch(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
    private boolean isMatch(char c1, char c2) {
        switch (c1) {
            case '(':
                return c2 == ')';
            case '{':
                return c2 == '}';
            case '[':
                return c2 == ']';
        }
        return false;
    }
}
// @lc code=end

