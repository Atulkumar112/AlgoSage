class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int n = pushed.length;
        
        int idx=0;
        for(int i=0; i<n; i++){
            if(pushed[i]==popped[idx]){
                st.push(pushed[i]);
                st.pop();
                idx++;
                while(!st.isEmpty() && st.peek() == popped[idx]){
                        st.pop();
                        idx++;
                }
            }
            else{
                st.push(pushed[i]);
            }
        }

        if(st.isEmpty()){
           return true;
        }
        return false;
    }
}
