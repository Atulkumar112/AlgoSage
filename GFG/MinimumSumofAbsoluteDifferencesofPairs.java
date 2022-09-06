class Solution { 
    long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);
        long ans = 0;
        for(int i=0; i<N; i++){
            ans += Math.abs(A[i] - B[i]);
        }
        
        return ans;
    }
}
