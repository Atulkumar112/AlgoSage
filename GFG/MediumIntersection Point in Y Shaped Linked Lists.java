
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
    // the TC:- O(N+M) and SC:- O(1)
    int intersectPoint(Node head1, Node head2){
        // for better understanding of this code, just see the  hint 
        int c1=0;
        int c2=0;
        
        // while(head1!=null){
        //     c1++;
                // head1=head1.next;    
        // }
        
        // while(head2!=null){
        //     c2++;
                // head2=head2.next;
        // }
        
        // use for loop insted of while loop for saving the head1 and head 2
        for(Node curr=head1; curr!=null; curr=curr.next){
            c1++;
        }
        
        for(Node curr=head2; curr!=null; curr=curr.next){
            c2++;
        }
        
        
        
        int d = Math.abs(c1-c2);
        
        // this temp is larger list 
        Node temp = c1>c2 ? head1 : head2;  //ternary operator
        
        
        while(d-->0 ){
            temp= temp.next;
            
        }
        
        // this node will be smaller list from head1 and head 2
        Node y = c1>c2 ? head2 : head1;
        
        // now on this here i am standing on same number of node (i stading before 1 
        // step of common)
        
        while(y!=null && temp!=null){
            if(y==temp)  return y.data;
            y=y.next; temp=temp.next;
        }        
        
        return -1;
    }
    
    // below code is writen by me and 109/129 test cases passed and the 
    // TC:- O(N*M) and SP:- O(N)
// 	int intersectPoint(Node head1, Node head2)
// 	{
//          Set<Node> set = new HashSet<>();
         
//          while(head1!=null){
//              set.add(head1);
//              head1 = head1.next;
//          }
         
//          while(head2!=null){
//              if(set.add(head2)){
//                 set.add(head2);
//              }
//              else{
//                  return head2.data; 
//              }
//              head2 = head2.next;
//          }
//          return -1;
// 	}
}
