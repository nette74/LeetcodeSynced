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
        ListNode start = new ListNode(-1);
        ListNode base = start;
        boolean dupe = false;
        while(now != null){


            if(now.next == null){
                if(!dupe) base.next = now;
                else base.next = null;
            } else if(now.next.val > now.val ) {

                if(dupe) {

                } else {
                    base.next = now;
                    base = base.next;
                }
                dupe = false;
            } else if(now.next.val == now.val ) {
                dupe = true;
            }
            now = now.next;
        }
        return start.next;
    }
}