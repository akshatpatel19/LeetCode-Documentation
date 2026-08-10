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
    public ListNode mergeNodes(ListNode head) {

        ListNode curr = head.next;
        ListNode temp = head;

        int sum = 0;

        while (curr != null) {

            sum += curr.val;

            if (curr.val == 0) {

                temp.next.val = sum;
                temp = temp.next;

                sum = 0;
            }

            curr = curr.next;
        }

        temp.next = null;

        return head.next;
    }
}