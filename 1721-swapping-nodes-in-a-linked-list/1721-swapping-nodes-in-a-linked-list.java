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
    public ListNode swapNodes(ListNode head, int k) {
        int size =1;
        ListNode curr = head;
        while(size<k)
        {
            curr = curr.next;
            size++;
        }
        ListNode first = curr;
        ListNode pres = first;
        ListNode second = head;
        while(first.next!=null)
        {
            first = first .next;
            second = second.next;
            
            
        }
        
       int temp = pres.val;
        pres.val = second.val;
        second.val = temp;
        
        return head;
        
    }
}

//   ListNode itr=head;
//         int count=1;
//         while(count++<k){
//           itr=itr.next;      
//         }
//         ListNode first=itr;
//         ListNode second=head;

//         while(itr.next!=null){
//           itr=itr.next;      
//           second=second.next;
//         }

//         int temp=first.val;
//         first.val=second.val;
//         second.val=temp;
        
//         return head;

