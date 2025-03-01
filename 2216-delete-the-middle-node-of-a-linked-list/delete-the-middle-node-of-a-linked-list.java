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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        return null;
        ListNode temp,prev;
        temp=head;
        prev=temp;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
           
            prev=slow;
            slow=slow.next;
        }
        if(prev.next!=null){
            prev.next=prev.next.next;
        }
        else{
            prev.next=null;
        }
        return head;

    }
}