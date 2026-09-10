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
        if(head== null || head.next == null)return;
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            st.push(temp);
            temp = temp.next;
        }
        int n = st.size();
        temp = head;
        for(int i =0; i<n/2; i++){
           ListNode top = st.pop();
           ListNode nextNode = temp.next;

           temp.next = top;
           top.next = nextNode;
           temp = nextNode;
        }
        temp.next = null;
        
    }
}