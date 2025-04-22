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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
       
        ListNode curr = head;
        
         
        while(curr!= null ){
          Boolean isDuplicate=false;
          while(curr.next!=null && curr.val == curr.next.val) {
            curr= curr.next;
            isDuplicate = true;
          }
            if(!isDuplicate){
                temp.next = curr;
                temp= temp.next;
            }
            curr = curr.next;

        }
        temp.next=null;
        return dummy.next;
    }
}