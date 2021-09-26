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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = 0; 
        ListNode node = head;
        while(node != null) {
            len++;
            node = node.next;
        }
        len = len-n;
        
        node = dummy;
        while(len > 0) {
            len --;
            node = node.next;
        }
        node.next = node.next.next;
        return dummy.next;
    }   
}
