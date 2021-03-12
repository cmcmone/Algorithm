/*
 * @lc app=leetcode id=7 lang=typescript
 *
 * [7] Reverse Integer
 */

// @lc code=start
function reverse(x: number): number {
  if (x > -10 && x < 10) return x;
  let multiple: number = 1;
  if (x < 0) {
    multiple = -1;
    x *= multiple;
  }

  let remainder = x % 10;
  let num: number = remainder;
  while (x - remainder !== 0) {
    x = (x - remainder) / 10;
    remainder = x % 10;
    num = num * 10 + remainder;
  }

  let ans = num * multiple;
  return Math.abs(ans) > Math.pow(2, 31) ? 0 : ans;
}
// @lc code=end
