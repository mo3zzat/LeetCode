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
    public int pairSum(ListNode head) {
        ListNode slow = head,fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode currNode = slow,prev = null;
        while (currNode != null){
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        int mxPair = 0;
        currNode = prev;
        while (head != null && currNode != null){
            mxPair = Math.max(mxPair,currNode.val + head.val);
            currNode = currNode.next;
            head = head.next;
        }
        return mxPair;
    }
}