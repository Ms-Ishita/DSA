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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        
        
        while(temp.next!=null && temp.next.next!=null){
            ListNode first = temp.next;
            ListNode second = temp.next.next;

            //Swap krane ka logic
            first.next = second.next;
            second.next = first;
            temp.next = second;

            //move to next 

            temp = first; 
            
            
        }
        return dummy.next;


    }
    
}