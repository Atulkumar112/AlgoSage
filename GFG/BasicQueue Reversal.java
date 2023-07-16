class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Queue<Integer> revQ = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        
        while(!st.isEmpty()){
            revQ.add(st.pop());
        }
        
        return revQ;
    }
}
