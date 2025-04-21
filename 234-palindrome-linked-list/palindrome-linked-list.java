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
    public ListNode mid(ListNode head){
       ListNode slow= head;
       ListNode fast = head;
       while(fast!=null && fast.next!=null){
         slow = slow.next;
         fast = fast.next.next;
       } 
       return slow;

    }
    public boolean isPalindrome(ListNode head) {
      ListNode left = head;
      ListNode mid = mid(head);
      ListNode prev = null;
      ListNode curr = mid;
      ListNode next = null;
      while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

    }
    ListNode right = prev;
    while(right!=null){
        if(left.val!=right.val){
            return false;
        }
        left = left.next;
        right= right.next;
    }
    return true;

      
      
     
    }
}