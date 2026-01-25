/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //find /detect the cycle
        ListNode slow=head;
        ListNode fast=head;
        boolean exist=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                exist=true;
                break;
            }
        }

        // if cycle if present
        if(!exist){
            return null;
        }
        slow=head;
        ListNode prev;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }
}