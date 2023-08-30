class GfG
{
    Node deleteNode(Node head, int x)
    {
	    Node temp = head;
	    if(x==1) return head.next;
	    int i=1;
	    
	    while(i<x-1){
	        temp = temp.next;
	        i++;
	    }
	    
	    if(temp.next.next == null) temp.next=null;
	    else temp.next = temp.next.next;
	    
	    return head;
    }
}
