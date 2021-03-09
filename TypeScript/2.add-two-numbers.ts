/*
 * @lc app=leetcode id=2 lang=typescript
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
  let l3: ListNode = new ListNode(0, null);
  let cur: ListNode = l3;
  let carry: number = 0;
  while (l1 != null || l2 != null) {
    let v1: number = l1 == null ? 0 : l1.val;
    let v2: number = l2 == null ? 0 : l2.val;
    let sum: number = v1 + v2 + carry;
    if (sum > 9) {
      carry = 1;
      sum -= 10;
    } else {
      carry = 0
    }
    cur.next = new ListNode(sum);
    cur = cur.next;
    l1 ? l1 = l1.next : null;
    l2 ? l2 = l2.next : null;
  }
  if (carry == 1) {
    cur.next = new ListNode(carry);
  }
  return l3.next;
};
// @lc code=end

