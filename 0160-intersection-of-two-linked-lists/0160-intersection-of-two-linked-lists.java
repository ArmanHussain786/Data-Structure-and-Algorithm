/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
   public int size(ListNode head){
    if(head == null) return 0;
    if(head.next == null) return 1;
    
    int size = 0;
    ListNode node = head;
    while(node != null){
        node = node.next;
        size++;
    }
    return size;
}

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) return null;
    
    // step-1
    int sizeA = size(headA);
    int sizeB = size(headB);
    
    // step-2
    int diff = Math.abs(sizeA - sizeB);
    ListNode c1 = headA;
    ListNode c2 = headB;
    
    // step-3
    if(sizeA > sizeB){
        for(int i = 0; i < diff; i++){
            c1 = c1.next;
        }
    }
    else{
        for(int i = 0; i < diff; i++){
            c2 = c2.next;
        }   
    }
    
    while(c1 != c2){
        c1 = c1.next;
        c2 = c2.next;
    }
    
    return c1;
}
}