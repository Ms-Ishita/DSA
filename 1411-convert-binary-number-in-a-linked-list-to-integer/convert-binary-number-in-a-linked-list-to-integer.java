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
    public int getDecimalValue(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        while(curr !=null){
            st.push(curr);
            curr = curr.next;    
        }
        int decimal = 0;
        int base = 1;
        while(!st.isEmpty()){
           decimal +=(st.pop().val)*base;
           base*=2;   
        }
        return decimal;
    }
}