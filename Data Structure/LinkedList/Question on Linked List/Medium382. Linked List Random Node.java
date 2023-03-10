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
    int len=0;
    ListNode globalNode;
    public Solution(ListNode head) {
        globalNode = head;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        Random rand = new Random();
        int idx = rand.nextInt(len); // it's exclusive so that why i added 1
        // idx+=1;
        ListNode temp = globalNode;
        for(int i=0; i<idx&&temp!=null; i++){
            temp = temp.next;
        }
        return temp==null ? null : temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
