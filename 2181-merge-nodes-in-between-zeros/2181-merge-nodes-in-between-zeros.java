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
    public ListNode mergeNodes(ListNode head) {
        if(head.val==0 && head.next==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
        ListNode curr = head.next;;
        ListNode res = new ListNode(-1);
        ListNode fff = res;
        int sum =0;
         while(curr!=null)
         {
             
             if(curr.val!=0 && head.val==0 && head.next!=null)
             {
                 sum = sum + curr.val;
                 //System.out.println(sum);
                 
             }
             else
             {
                ListNode prev = new ListNode(sum);
                 res.next = prev;
                 res = res.next;
                 sum =0;
             }
             curr = curr.next;
         }
        return fff.next;
    }
}