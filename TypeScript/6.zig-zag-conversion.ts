/*
 * @lc app=leetcode id=6 lang=typescript
 *
 * [6] ZigZag Conversion
 */

// @lc code=start
function convert(s: string, numRows: number): string {
  if (s.length == 1 || numRows == 1) return s;

  let row: number = 0;
  let direction: boolean = false;
  let str: string[] = new Array(numRows).fill("");
  for (let pos = 0; pos < s.length; pos++) {
    str[row] += s.charAt(pos);

    if (row === 0 || row === numRows - 1) {
      direction = !direction;
    }

    direction ? row++ : row--;
  }

  return str.join("");
}
// @lc code=end
