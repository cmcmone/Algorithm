/*
 * @lc app=leetcode id=3 lang=typescript
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
function lengthOfLongestSubstring(s: string): number {
  if (s.length == 0) return 0;
  let map: Map<string, number> = new Map();
  let max: number = 0;
  let left: number = 0;
  for (let right: number = 0; right < s.length; right++) {
    if (map.has(s.charAt(right))) {
      left = Math.max(map.get(s.charAt(right)) + 1, left);
    }
    map.set(s.charAt(right), right);
    max = Math.max(max, right - left + 1);
  }
  return max;
}
// @lc code=end
