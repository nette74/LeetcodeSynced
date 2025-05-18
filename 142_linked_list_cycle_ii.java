/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;

public class Solution {
    public ListNode detectCycle(ListNode head) {
               Set<ListNode> visited = new HashSet( );
        ListNode now = head;
        while(now != null){
            if(visited.contains(now)) return now;
            visited.add(now);
            now = now.next;
        }
        return null;
    }
}