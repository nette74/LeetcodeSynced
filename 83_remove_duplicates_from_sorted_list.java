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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode now = head;
        ListNode base = head;
        while(now != null){

            if(now.next != null && now.next.val > now.val){

                base.next = now.next;
                base = now.next;

            } else if(now.next == null){
                base.next = null;

            }
            now = now.next;
        }
        return head;
    }
}