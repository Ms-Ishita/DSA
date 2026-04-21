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
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode temp = head;
        while(temp!=null){
            st.push(temp);
            temp = temp.next;
        }
        temp = head;
        int size = st.size();
        for(int i =0; i<size/2; i++){
            ListNode last = st.pop();
            ListNode front = temp.next;
            temp.next = last;
            last.next = front;
            temp = front;
        }
        temp.next = null;
        
    }
}