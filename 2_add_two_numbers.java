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
        ListNode i = l1;
        ListNode j = l2;
        ListNode start = new ListNode(-1);
        ListNode now = start;
        int adder = 0;
        while(true){
            now.next = new ListNode(0);
            now = now.next;
            int iv = i == null ? 0 : i.val;
            int jv = j == null ? 0 : j.val;

            int result = iv + jv + adder;
            if(result >= 10){
                result -= 10;
                adder = 1;
            } else {
                adder = 0;
            }

            now.val = result;


            if(i != null) i = i.next;
            if(j != null) j = j.next;
            if( i == null && j == null) {
                if(adder == 1) now.next = new ListNode(1);
                break;
            }
        }
        return start.next;
    }
}