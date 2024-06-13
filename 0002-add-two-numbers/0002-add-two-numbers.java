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
import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode next1 = l1;
        ListNode next2 = l2;
        ListNode head = new ListNode();
        ListNode cur = head;
        while(next1 != null | next2 != null | carry==1){
            int sum = (next1 != null ? next1.val : 0) + (next2 != null ? next2.val : 0);
            if(carry==1){
                sum += 1;
                carry = 0;
            }
            
            if(sum < 10) {
                cur.next = new ListNode(sum);
                cur = cur.next;
            }else if(sum == 10){
                cur.next = new ListNode(0);
                cur = cur.next;
                carry = 1;
            }else{
                cur.next = new ListNode(sum%10);
                cur = cur.next;
                carry = 1;
            }
            
            next1 = next1 == null ? null : next1.next;
            next2 = next2 == null ? null : next2.next;
        }
    
        return head.next;
    }
}