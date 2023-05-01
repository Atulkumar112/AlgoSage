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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;

        int n = 1;
        ListNode newHead = head, tail = head;
        while(tail.next!=null){
            tail = tail.next;
            n++;
        }

        tail.next = head;
        k %=n;

        for(int i=0; i<n-k; i++){
            tail = tail.next;
        }

        newHead = tail.next;
        tail.next = null;

        return newHead;
    }
}

//-------------------------------------------------------------------
//TLE and MLE error comes occure :`(
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         int n = 0;
//         ListNode temp = head;
        
//         while(temp!=null){
//             n++;
//         }
//         ListNode curr = head;
//         int[] arr = new int[n];
//         int d=0;
//         while(curr!=null){
//             arr[d]=curr.val;
//             d++;
//         }

//         while(k-->0){
//             int temp1 = arr[0];
//             for(int i=1; i<n; i++){
//                 int temp2 = arr[i];
//                 arr[i] = temp1;
//                 temp1 = temp2;
//             }   
//             arr[0]=temp1;

//         }

//         System.out.println(Arrays.toString(arr));

//         return head;

//     }
// }
