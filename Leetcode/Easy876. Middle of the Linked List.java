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
    public ListNode middleNode(ListNode head) {
        // below code is done by my selft :)
       ListNode currNode = head;  // only just i saw this thing on github like how to 
        // initialize new node 
        int s =0;
        while(currNode != null){   // this loop finding the lenght
            currNode = currNode.next;
            s++;
        }
        
        int i=0;
        if(s%2==0){
            i=(s/2)-1;
        }
        else{
            i=(s/2)-1;
        }
        
        
        while(i>=0){   // this loop distory the all starting nods which are not required
            head = head.next;
            i--;
        }
        
        return head;
        
        //////////--------------- Solution form discussion 
        // ListNode slow = head, fast = head;
        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // return slow;
    }
}
