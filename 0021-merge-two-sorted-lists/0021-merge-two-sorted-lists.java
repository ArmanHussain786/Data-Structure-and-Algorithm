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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        {
            return list1;
        }
         ListNode curr1 = list1;
         ListNode curr2 = list2;
    
        ListNode ans = new ListNode(-1);
        ListNode ref = ans;
        while(curr1!=null && curr2!=null)
        {
            if(curr1.val<curr2.val)
            {
                ans.next = new ListNode(curr1.val);
                ans= ans.next;
                curr1=curr1.next;
            }
            else
            {
                ans.next = new ListNode(curr2.val);
                ans=ans.next;
                curr2=curr2.next;
            }
            
        }
        if(curr1==null)
        {
            ans.next = curr2;
        }
        if(curr2==null)
        {
            ans.next = curr1;
        }
        return ref.next;
    }
}