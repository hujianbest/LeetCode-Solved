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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode p = headA;  
        ListNode q = headB; 
        if(p == q) return p;
        int plen=length(headA);
        int qlen=length(headB);
        int dif=(plen>qlen)?(plen-qlen):(qlen-plen);
        if(plen>qlen){
            p=headA;
            q=headB;
        }else{
            p=headB;
            q=headA;
        }
        for(int i=0;i<dif;i++)
            p=p.next;
        while(p!=null && q!=null){
            if(p==q) return p;
            p=p.next;
            q=q.next;
        }
        return null; 
    }
    
    private int length(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
    return length;
    }
}