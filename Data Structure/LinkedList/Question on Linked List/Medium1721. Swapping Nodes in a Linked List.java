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
// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         if(head==null) return head;
//         k=k-1;
//         int n = 0;
//         ListNode temp = head;
        
//         while(temp!=null){
//             n++;
//             temp = temp.next;
//         }

//         int[] arr = new int[n];
//         int i=0;

//         while(head!=null){
//             arr[i]=head.val;
//             head=head.next;
//         }

//         ListNode ansHead = new ListNode(arr[0]);
//         ListNode curr = ansHead;
//         for(int j=1; j<n; j++){
//             ListNode temp2 = new ListNode(arr[j]);
//             curr.next = temp2;
//             curr = curr.next;
//         }

//         return ansHead;
//     }
// }



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
        ListNode itr=head;
        int count=1;
        while(count++<k){
          itr=itr.next;      
        }
        ListNode first=itr;
        ListNode second=head;

        while(itr.next!=null){
          itr=itr.next;      
          second=second.next;
        }

        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        
        return head;
    }
}
