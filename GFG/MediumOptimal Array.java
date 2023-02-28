class Solution {
    
    // geting TLE after 1112/1117 test case passed 
    public long[] optimalArray(int n,int a[])
    {
        
        long[] ans = new long[n];

        ans[0] = 0;
         for(int i = 1; i < n; i++) {
                    ans[i] = a[i]-a[i/2] + ans[i-1];
        }
         return ans;
        //------------------------------------
        // long ans[] = new long[n];
        // for(int i=0; i<n; i++){
        //     int med = 0;
        //     if((i+1)%2==0){
        //         med = (a[i/2]+a[(i+1)/2])/2;
        //     }
        //     else{
        //         med = a[i/2];
        //     }
            
        //     long curr = 0;
        //     for(int j=0; j<=i; j++){
        //         curr+=Math.abs(a[j]-med);
        //     }
        //     ans[i]=curr;
        // }
        
        // return ans;
    }
}
