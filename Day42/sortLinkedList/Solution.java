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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode midd=getMid(head);
        ListNode right=midd.next;
        midd.next=null;
        ListNode newLeft=sortList(head);
        ListNode newRight=sortList(right);
        return merge(newLeft,newRight);
    }
    public ListNode getMid(ListNode head){
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode temp=new ListNode(-1);
        ListNode result=temp;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                temp=temp.next;
                left=left.next;
            }else{
                temp.next=right;
            temp=temp.next;
            right=right.next;
            }
        }
        while(left!=null){
               temp.next=left;
                temp=temp.next;
                left=left.next;
        }
        while(right!=null){
            temp.next=right;
            temp=temp.next;
            right=right.next;
        }
        return result.next;
    }
}