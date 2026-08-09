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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        int count = 0;

        // Check if k nodes are available
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // Less than k nodes → don't reverse
        if (count < k) {
            return head;
        }

        // Reverse first k nodes
        ListNode prev = null;
        curr = head;

        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // head is now the last node of reversed group
        head.next = reverseKGroup(curr, k);

        // prev is the new head
        return prev;
    }
}