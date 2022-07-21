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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftNode = head;
        for(int i=1;i<left;i++){
            leftNode=leftNode.next;
        }
        while(left<=right){
            ListNode temp=leftNode;
            for(int i=1;i<=right-left;i++){
                int t=temp.val;
                temp.val=temp.next.val;
                temp.next.val=t;
                temp=temp.next;
            }
            right--;
        }
        return head;
    }
}
