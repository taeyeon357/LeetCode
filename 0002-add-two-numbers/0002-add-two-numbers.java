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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode head = node;
        int carry = 0;
        while(true){
            if(l1 != null && l2 != null){
                node.next = new ListNode((l1.val + l2.val + carry)%10);
                carry = (l1.val + l2.val + carry)/10;
                l1 = l1.next;
                l2 = l2.next; 
            }else if(l1 != null){
                node.next = new ListNode((l1.val + carry)%10);
                carry = (l1.val + carry) / 10;
                l1 = l1.next;
            }else if(l2 != null){
                node.next = new ListNode((l2.val + carry)%10);
                carry = (l2.val + carry) / 10;
                l2 = l2.next;
            }else if(carry == 1){
                node.next = new ListNode(1);
                break;
            }else{
                break;
            }
            node = node.next;
            
        }

        return head.next;
        
    }
}