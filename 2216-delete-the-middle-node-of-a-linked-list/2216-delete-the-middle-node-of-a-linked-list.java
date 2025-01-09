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
    public ListNode deleteMiddle(ListNode head) {
        ListNode ln = head;
        int n = 0;
        while (ln != null){
            n++;
            ln = ln.next;
        }
        System.out.println(n);
        n  = n / 2 - 1;
        ln = head;
        while (n > 0){
            ln = ln.next;
            n--;
        }
        if(head.next != null)
            ln.next = ln.next.next;
        else{
            return head.next;
        }
        return head;
    }
}