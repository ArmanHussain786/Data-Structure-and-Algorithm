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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null)
        {
            res.add(curr.val);
            curr= curr .next;
        }
        int ans =0;
        int count=0;
        for(int i=res.size()-1;i>=0;i--)
        {
            if(res.get(i)==1)
            {
                ans = ans + (int)Math.pow(2,count);
               
            }
            else
            {
                ans = ans +0;
            }
             count++;
        }
        return ans;
        
    }
}