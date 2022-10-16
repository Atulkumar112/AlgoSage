/*

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
    public static Node moveToFront(Node head) {
        
        if(head.next==null){
            return head;
        } 
        
        Node secCurrNode = head;
        Node lastNode = head.next;
        
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secCurrNode=secCurrNode.next;
        }
        
        secCurrNode.next=null;
        
        lastNode.next = head;
        head=lastNode;
        
       return head;
        
    }
}
