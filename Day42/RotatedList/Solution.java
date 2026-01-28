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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=(k)%size;
        if(k==0){
            return head;
        }
        ListNode prev=null;
        temp=head;
        int i=0;
        while(i<size-k){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=null;
        prev=head;
        head=temp;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=prev;
        return head;
        
    }
}