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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode pointer = head;
        
        ListNode n1 = list1;
        ListNode n2 = list2;
        while(n1 != null || n2 != null){
            if(n1 == null){
                pointer.next = n2;
                break;
            }
            if(n2 == null){
                pointer.next = n1;
                break;
            }
            
            ListNode node;
            if(n1.val <= n2.val){
                node = new ListNode(n1.val);
                pointer.next = node;
                n1 = n1.next; 
            }else{
                node = new ListNode(n2.val);
                pointer.next = node;
                n2 = n2.next;
            }
            pointer = pointer.next;         
        }
        return head.next;
    }
}