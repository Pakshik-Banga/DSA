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
    public boolean isPalindrome(ListNode head) {
        
        
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            
            fast = fast.next.next;
            slow = slow.next;
            
            
        }
        
        
        
        ListNode p   = reverse(slow);
        ListNode s = p;
        ListNode h = head;
        
        while(h!=slow){
            
            if(p.val!=h.val)return false;
            
            p = p.next;
            h = h.next;
        }
        
        return true;
        
        
    }
    
    public static ListNode reverse(ListNode head){
        
     
        if(head.next==null)return head;
        ListNode h = head.next;
        
        ListNode t = reverse(h);
        
        h.next = head;
        head.next = null;
        
        return t;
        
        
    }
    
    
}