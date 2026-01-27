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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle=midpoint(head);
        ListNode rightNode=middle.next;
        middle.next=null;
        ListNode left=insertionSortList(head);
        ListNode right=insertionSortList(rightNode);
        return merge(left,right);
    }
    public ListNode merge(ListNode right,ListNode left){
        ListNode newNode=new ListNode(-1);
        ListNode temp=newNode;
        while(right!=null && left!=null){
            if(right.val<left.val){
                temp.next=right;
                temp=temp.next;
                right=right.next;
            }else{
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
        }
        //remesing
        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        return newNode.next;
    }
    public ListNode midpoint(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}