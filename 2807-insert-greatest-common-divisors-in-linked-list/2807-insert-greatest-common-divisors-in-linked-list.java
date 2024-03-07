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
    public static int findGCD(int a, int b)  
    {  
        while(b != 0)  
        {  
            if(a > b)  
            {  
                a = a - b;  
            }  
            else  
            {  
                b = b - a;  
            }  
        }  
        return a;  
        }  
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode pre = head;
        ListNode temp = head.next;
        while(temp != null){
            ListNode newNode = new ListNode(findGCD(pre.val , temp.val));
            newNode.next = pre.next;
            pre.next = newNode;
            pre = temp;
            temp = temp.next;
        }
        return head;
    }
}