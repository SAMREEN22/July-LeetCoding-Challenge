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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0),smallCurr=small;
        ListNode large=new ListNode(0),largeCurr=large;
        while (head!=null) {
            if (head.val<x) {
                smallCurr.next=new ListNode(head.val);
                smallCurr=smallCurr.next;
            } else {
                largeCurr.next=new ListNode(head.val);
                largeCurr=largeCurr.next;
            }
            head=head.next;
        }
        smallCurr.next=large.next;
        return small.next;
    }
}
