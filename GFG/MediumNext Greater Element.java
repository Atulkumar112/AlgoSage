
class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        long[] ans=new long[n];
        ans[n-1]=-1;
        Stack<Long> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
        
        
        // below is my code and running 137/158 test cases and then time limit excedeed
        // long ans[] = new long[n];
        // for(int i=0; i<n-1; i++){
        //     long val=arr[i];
        //     boolean b = true;
        //     for(int j=i+1; j<n; j++){
        //         if(val<=arr[j]){
        //             ans[i]=arr[j];
        //             b=false;
        //             break;
        //         }
        //     }
        //     if(b){
        //         ans[i]=-1;
        //     }
        // }
        // ans[n-1]=-1;
        // return ans;
    } 
}
