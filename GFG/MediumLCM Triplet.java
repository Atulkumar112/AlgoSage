class Solution {
    long lcmTriplets(long N) {
        // code here
        if(N<=2){
            return N;
        }
        
        if((N&1)==1){   // This is for to check odd number
            return N*(N-1)*(N-2);    
        }
        if(N%3==0) return (N-1)*(N-2)*(N-3);
        
        return N*(N-1)*(N-3);
    }
}
