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
    
public ListNode reverseBetween(ListNode head, int l, int r) {
    //left pointer
    //right pointer 
    if(l==r||head==null)return head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    head=dummy;
    ListNode leftprev = head;    
    ListNode rightnext = head;
    for(int i =0; i<l-1; i++){
       leftprev = leftprev.next;
    }
    ListNode left= leftprev.next;
    ListNode right=head;
    for(int i =0; i<r; i++){
        right = right.next;
    }
    rightnext=right.next;
    
    leftprev.next=null;
    right.next=null;
    

    ListNode prev = null;
    ListNode curr = left;
    ListNode next = null;

    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev= curr;
        curr = next;  
    }
    
    leftprev.next=right;
    left.next=rightnext;

    return dummy.next;


    //reverse the middle linked list
    
    //arrangement 
}
}