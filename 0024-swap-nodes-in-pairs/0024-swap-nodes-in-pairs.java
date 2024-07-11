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
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode();
        ListNode root = node;
        node.next = head;
    
        while(node.next != null && node.next.next != null){
            ListNode n = node.next;
            ListNode nn = node.next.next;
            
            n.next = nn.next;
            node.next = nn;
            node.next.next = n;
            
            node = node.next.next;
        }
        return root.next;
    }
}