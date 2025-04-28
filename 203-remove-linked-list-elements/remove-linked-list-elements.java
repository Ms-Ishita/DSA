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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1), temp = dummy;
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null){
            if(curr.val!=val){
                temp.next = new ListNode(curr.val);
                temp = temp.next;
                
                

            }
            curr= curr.next;

        }
        return dummy.next;
        
    }
}