

/* class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        // now use the optimize approach called is slow and fast pointer approach
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        
        if(fast==null || fast.next==null) return -1;
        Node temp = head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return slow.data;
        
        
        
        // the time and space complexity is O(n);
        // Set<Node> set = new HashSet<>();
        // Node temp = head;
        // while(temp!=null){
        //     if(set.contains(temp)){
        //         return temp.data;
        //     }
        //     else{
        //         set.add(temp);
        //     }
        //     temp = temp.next;
        // }
        
        // return -1;
    }
}
