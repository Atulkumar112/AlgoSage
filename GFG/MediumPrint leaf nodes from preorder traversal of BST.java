class Solution
{
    public int[] leafNodes(int arr[], int N)
    {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        //5 3 2 4 7 6 8
        st.push(arr[0]);
        for(int i=1; i<N; i++){
            if(arr[i]<st.peek()){
                st.push(arr[i]);
            }
            else{
                int temp = st.peek();
                int remove = 0;
                while(!st.isEmpty() && arr[i]>st.peek()){
                    st.pop();
                    remove++;
                }
                st.push(arr[i]);
                if(remove>=2){
                    ans.add(temp);
                }
            }
        }
        
        ans.add(st.peek());
        int[] res = new int[ans.size()];
        int idx=0;
        for(int i:ans){
            res[idx++] = i;
            
        }
        
        return res;
    }
}
