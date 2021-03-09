/*
 * @lc app=leetcode id=4 lang=typescript
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
  let n = nums1.length;
  let m = nums2.length;

  let left: number = 0;
  let right: number = 0;
  let aPos: number = 0;
  let bPos: number = 0;

  let res: number = 0;

  if ((n + m) % 2 == 0) {
    for (let i = 0; i < (n + m) / 2 + 1; i++) {
      left = right;
      if (aPos < n && (bPos >= m || nums1[aPos] <= nums2[bPos])) {
        right = nums1[aPos];
        aPos++;
      } else {
        right = nums2[bPos];
        bPos++;
      }
    }
    res = (right + left) / 2;
  } else {
    for (let i = 0; i < (n + m + 1) / 2; i++) {
      if (aPos < n && (bPos >= m || nums1[aPos] <= nums2[bPos])) {
        right = nums1[aPos];
        aPos++;
      } else {
        right = nums2[bPos];
        bPos++;
      }
    }
    res = right;
  }
  return res;
}
// @lc code=end
