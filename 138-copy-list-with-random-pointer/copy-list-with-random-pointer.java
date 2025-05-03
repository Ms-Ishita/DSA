/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyList(Node head) {
        Node dummy = new Node(-1), temp = dummy;
        Node curr = head;
        while (curr != null) {
            temp.next = new Node(curr.val);
            temp = temp.next;
            curr = curr.next;

        }
        return dummy.next;

    }

    public Node copyRandomList(Node head) {
        if(head == null)return null;
        Node newHead = copyList(head);
        Node temp1=head, temp2 = head;
        Node temp3=newHead, temp4 = newHead;
        while (temp2 != null) {
            temp1=head;
            temp3=newHead;
            while (temp1 != temp2.random) {
                temp1 = temp1.next;
                temp3 = temp3.next;
            }
            temp4.random=temp3;
            temp4=temp4.next;
            temp2=temp2.next;
          
        }
        return newHead;

    }
}