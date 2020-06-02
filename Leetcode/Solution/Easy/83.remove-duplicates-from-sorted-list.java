/*
 * @lc app=leetcode id=83 lang=java
 * @version 1.00 June 1, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - [83] Remove Duplicates from Sorted List
 * - https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        var current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
// @lc code=end

