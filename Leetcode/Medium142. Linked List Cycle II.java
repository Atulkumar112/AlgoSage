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
 // Both approach is very easy just learn at once 
public class Solution {
    // TC & SC is:- O(N)
    // let me optimized the code using slow and fast pointer
    // below code is written by me.
    // public ListNode detectCycle(ListNode head) {
    //     Map<ListNode, Integer> map = new HashMap<>();
    //     ListNode curr = head;
    //     while(curr!=null){
    //         if(map.containsKey(curr)){
    //             return curr;
    //         }
    //         map.put(curr, 0);
    //         curr = curr.next;
    //     }

    //     return null;
    // }

    // Slow and Fast pointer
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;  // or you can return fast as well 
            }
        }
        return null;
    }

}
