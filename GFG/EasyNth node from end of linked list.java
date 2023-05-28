
class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    // 1112 /1113 TC passed then Time Limit Exceeded
    // int getNthFromLast(Node head, int n){
    // {
    //     List<Integer> list = new ArrayList<>();
    //     Node temp = head;
    //     while(temp!=null){
    //         list.add(temp.data);
    //         temp = temp.next;
    //     }
        
    //     if(list.size() < n){
    //         return -1;
    //     }
        
    //     Collections.reverse(list);
    //     return list.get(n-1);
        
    // }
    
    //------------------------------------ 
    int getNthFromLast(Node head, int n){
        Node curr = head;
        int count=0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        if(count<n){
            return -1;
        }
        
        int delete = count-n;
        while(delete-->0){
            head = head.next;
        }
        
        return head.data;
    }
}
