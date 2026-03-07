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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode prev=null;
        int value=0;
        while(temp1!=null && temp2!=null){
            int ans=temp1.val+temp2.val+value;
            value=0;
            if(ans>9){
                value=ans/10;
                ans=ans%10;
            }
            temp1.val=ans;
            prev=temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        while(temp1!=null){
            int ans=temp1.val+value;
            value=0;
            if(ans>9){
                value=ans/10;
                ans=ans%10;
            }
            prev=temp1;
            temp1.val=ans;
            temp1=temp1.next;
        }
         while(temp2!=null){
            int ans=temp2.val+value;
            value=0;
            if(ans>9){
                value=ans/10;
                ans=ans%10;
            }
            ListNode next=new ListNode(ans);
            prev.next=next;
            prev=prev.next;
            temp2=temp2.next;
        }
        if(value>0){
           ListNode next=new ListNode(value);
            prev.next=next;
        }
        return l1;
    }
}