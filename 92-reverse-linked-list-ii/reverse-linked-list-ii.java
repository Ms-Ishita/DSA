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
    public ListNode reverseBetween(ListNode head, int left, int right) { 
           
        if(left==right || head == null)return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy ;
        ListNode leftprev = head;
        ListNode rightnext = head;
        for(int i =0; i<left-1; i++){
            leftprev = leftprev.next;
        }
        ListNode l= leftprev.next;
        ListNode r = head;
        
        for(int i =0; i<right; i++){
            r= r.next;
        }
        rightnext=r.next;
        
        leftprev.next = null;
        r.next = null;
        
        ListNode prev = null;
        ListNode curr = l;
        ListNode next = null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        leftprev.next = r;
        l.next = rightnext;
        
        return dummy.next;
        
        
    }
}