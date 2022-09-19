//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        
        List<Integer> list = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && st.peek()>=a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(a[i]);
        }
        return list;
    }
}
