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
import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode tail = new ListNode();
        ListNode now = head;
        Stack<Integer> stack = new Stack<>();
        
        while (now != null){
            stack.push(now.val);
            now = now.next;
        }
        
        now = tail;
        while (!stack.isEmpty()){
            now.next = new ListNode(stack.pop());
            now = now.next;
        }
        return tail.next;
    }
}