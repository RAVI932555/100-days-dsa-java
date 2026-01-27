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
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        ListNode extra=new ListNode(-1);
        ListNode t=extra;
        while(temp!=null){
            extra.next=temp.next;
            prev=temp;
            if(temp.next==null){
                break;
            }
            temp.next=temp.next.next;
            
            temp=temp.next;
            extra=extra.next;
            extra.next=null;
        }
        prev.next=t.next;
        t.next=null;
        return head;
    }
}