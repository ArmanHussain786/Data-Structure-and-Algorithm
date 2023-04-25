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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if(head==null || head.next==null)
        // {
        //     return head;
        // }
         if(fcd(head)==null)
        {
            return null;
        }
       ListNode starting = startingNode(head);
       if(starting == null)
       {
           return null;
       }
        else
        {
            return starting;
        }
        
        
    }
    
    //finding the cycle
    public static ListNode fcd(ListNode head)
    {
         if(head==null)
          return head;
         ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null )
        {
            slow = slow.next;
            fast = fast.next.next;
            
           if(slow == fast)
           {
              return slow;
           }
        }
        return null;
    }
    public static ListNode startingNode(ListNode head)
    {
        if(head == null)
        {
            return null;
        }
        ListNode intersection = fcd(head);
        ListNode temp = head;
        while(temp!=intersection)
        {
            temp = temp.next;
            intersection = intersection.next;
        }
        return temp;
    }
    
}