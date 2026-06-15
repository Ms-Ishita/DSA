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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i =1; i<size-k+1; i++){
            slow = slow.next;

        }
        for(int i =1; i<k; i++){
           fast = fast.next;
        }
        int curr = slow.val;
        slow.val = fast.val;
        fast.val = curr;
        return head;
        
    }
}