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
    public ListNode removeNodes(ListNode head) {
        
        ListNode curr=  reverse(head);
        ListNode currHead = curr.next;
        ListNode res = new ListNode(-1);
        ListNode reference = res;
        res.next = new ListNode(curr.val);
        res = res.next;
        int maxi = curr.val;
        while(currHead!=null)
        {
            if(currHead.val>=maxi)
            {
                res.next = new ListNode(currHead.val);
                maxi = currHead.val;
                res = res.next;
                
               
            }
             currHead = currHead.next;
        }
        
        return reverse(reference.next);
        
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode forward = null;
        while(curr!=null)
        {
            forward= curr.next;
            curr.next = prev ;
            prev = curr;
            curr = forward;
          
        }
        return prev;
    }
}