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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode odd = new ListNode(0);
        ListNode oddCur = odd;
        ListNode even = new ListNode(0);
        ListNode evenCur = even;
        int n = 1;
        while (head != null){
            if(n%2 != 0){
                oddCur.next = head;
                oddCur = oddCur.next;
            }else {
                evenCur.next = head;
                evenCur = evenCur.next;
            }
            n++;
            head = head.next;
        }
        evenCur.next = null;
        oddCur.next = even.next;
        return odd.next;
    }
}