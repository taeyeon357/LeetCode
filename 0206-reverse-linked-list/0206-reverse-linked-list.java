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
    public ListNode reverseList(ListNode head) {
        if(head != null){
            ListNode result = new ListNode(head.val);
            head = head.next;
            while(head != null){
                ListNode node = new ListNode(head.val);
                node.next = result;
                result = node;
                head = head.next;
            }
            
            return result;
        }else{
            return null;
        }
        
        
    }

}