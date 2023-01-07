
/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
    
    class GfG
{
    Node flatten(Node root){
	    if(root == null || root.next == null) return root;
	    Node head = root, nextHead = root.next;
	    while(nextHead != null){
	        Node temp = nextHead.next;
	        head.next = null;
	        nextHead.next = null;
	        head = merge(head, nextHead);
	        nextHead = temp;
	    }
	    return head;
    }
    
    Node merge(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        if(head1.data <= head2.data){
            head1.bottom = merge(head1.bottom, head2);
            return head1;
        }
        head2.bottom = merge(head1, head2.bottom);
        return head2;
    }
}
    
    
    
    
    
// belwo is the youtube solution. 50/70 test case passed i don't know hwyu it is not working.
// class GfG
// {
//     Node flatten(Node root){
//         Node nextNode = root.next;
//         while(nextNode!=null){
//             Node t=nextNode;
//             Node p = root;
//             Node p_pre = null;
//             while(t!=null && p!=null){
//                 if(p.data>=t.data && p==root){
//                     p_pre = t;
//                     t=t.bottom;
//                     p_pre.bottom=p;
//                     root=p_pre;
//                     // System.out.println(p.data);
//                 }
//                 else if(p.data >= t.data){
//                     p_pre.bottom=t;
//                     t=t.bottom;
//                     p_pre=p_pre.bottom;
//                     p_pre.bottom=p;
//                 }
//                 else{
//                     p_pre=p;
//                     p=p.bottom;
//                 }
//             }
//             if(p==null && t!=null){
//                 p_pre.bottom=t;
//             }
            
//             nextNode = nextNode.next;
//         }
//      return root;   
//     }
    
    // below is my code. complete logic is fine but it's showing the time limit exceed 
    // becuse i had not use merge short.
    /*Node myHead;
    Node flatten(Node root)
    {
	    List<Integer> list = new ArrayList<>();
	    while(root!=null){
	        while(root.bottom != null){
	            list.add(root.bottom.data);
	            root.bottom = root.bottom.bottom;
	        }
	        list.add(root.data);
	        root = root.next;
	    }
	    Collections.sort(list);
	   // System.out.println(list);
	    
	    for(int i=0; i<list.size(); i++){
	        printLinkedList(list.get(i));    
	    }
	    
	    return myHead;
    }
    
    
    public void printLinkedList(int val){
        Node newNode = new Node(val);
        
        if(myHead==null){
            myHead=newNode;
        }
        
        Node currNode = myHead;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        
        currNode.next=newNode;
        
        
    } */
// }
