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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        
        ListNode cur = head;
        while(cur != null){
            stk.push(cur.val);
            cur = cur.next;
        }
        
        int top;
        cur = head;
        while(!stk.isEmpty()){
            top = stk.pop();
            if(top != cur.val) return false;
            cur = cur.next;
        }
        return true;
    }
}