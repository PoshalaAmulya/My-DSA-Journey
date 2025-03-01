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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        return null;
        ListNode newHead= new ListNode(-99);
        newHead.next=head;
        ListNode temp=newHead;
        temp=temp.next;
        ListNode fast1= head;
        ListNode even= new ListNode(-100);
        ListNode eTemp=even;
        while(fast1!=null && fast1.next!=null){
            eTemp.next=fast1.next;
            eTemp=eTemp.next;
            fast1=fast1.next.next;
            temp.next=fast1;
            if(temp.next!=null)
            temp=temp.next;
        }
        eTemp.next=null;
        // while(even!=null){
        //     System.out.print(even.val+" ");
            // even=even.next;
        // }
       
        temp.next=even.next;
        return newHead.next;
        
    }
}