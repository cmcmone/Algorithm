/*
 * @lc app=leetcode id=5 lang=typescript
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
function longestPalindrome(s: string): string {
  if (s.length == 1) return s;
  let left: number = 0;
  let max: number = 1;
  for (let i = 0; i < s.length - 1; i++) {
    for (let j = i + 1; j < s.length; j++) {
      if (max < j - i + 1 && isPalindrome(s, i, j)) {
        left = i;
        max = j - i + 1;
      }
    }
  }
  return s.substring(left, left + max);
}

function isPalindrome(s: string, left: number, right: number): boolean {
  while (left < right) {
    if (s.charCodeAt(left++) != s.charCodeAt(right--)) {
      return false;
    }
  }
  return true;
}
// @lc code=end
