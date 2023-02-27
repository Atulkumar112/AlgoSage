Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node reverse(Node head, int k) {
        Node curr = head;
        
        for(int i=1; i<k; i++){
            curr = curr.next;
        }
        
        Node secHead = curr.next;
        curr.next = null;
        
        Node r1 = letReverse(head);
        Node r2 = letReverse(secHead);
        
        curr = r1;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = r2;
        
        return r1;
        
    }
    
   public static Node letReverse(Node head){
        Node prev=null, curr=head, next=null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            //updat
            prev = curr;
            curr = next;
            
        }
        
        return prev;
   }
}
