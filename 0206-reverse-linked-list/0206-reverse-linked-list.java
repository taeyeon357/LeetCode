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
        if(head != null){ //빈 리스트가 아닐 경우 시작
            //result에 node 추가
            ListNode result = new ListNode(head.val);
            //다음 노드로 변경
            head = head.next;
            //빈 리스트가 아니라면
            while(head != null){
                //현재 노드를 저장
                ListNode node = new ListNode(head.val);
                //현재 노드의 next를 이전 노드로 지정
                node.next = result;
                //이전 노드를 현재 노드로 변경
                result = node;
                //다음 노드로 변경
                head = head.next;
            }
            return result;
            
        }else{
            return null;
        }
        
        
    }

}