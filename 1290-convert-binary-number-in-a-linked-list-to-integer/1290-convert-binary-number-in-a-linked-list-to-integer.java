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
        ArrayList<Integer> zap = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null)
        {
             zap.add(curr.val);
            curr = curr.next;
        }
        int res=0;
        int count=0;
        for(int i=zap.size()-1;i>=0;i--)
        {
            int ans = zap.get(i);
	        if(ans==1)
	           res = res + (int)Math.pow(2,count);
	        else
	           res = res + 0;
	     
	     count++;
        }
        
       
        return res;
        
    }
}