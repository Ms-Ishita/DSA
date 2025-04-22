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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> allvalue = new ArrayList<>();

        for(ListNode list : lists){
            while(list!=null){
                allvalue.add(list.val);
                list = list.next;
            }
        }

        Collections.sort(allvalue);

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for(int val : allvalue){
            temp.next = new ListNode(val);
            temp = temp .next;
        }

        return dummy.next;
    

    }
}