class Solution {
    static long maxDiamonds(int[] a, int n, int k) {
        // code here
        //---------------------------------------------------------------------
        //1nd approach and 1110/1115 test case passed and given TLE
        // int ans=0;
        // for(int i=0; i<k; i++){
        //     Arrays.sort(a);
        //     ans+=a[n-1];
        //     a[n-1] = a[n-1]/2;
                
        // }        
        // return ans;
        //-------------------------------------------------------------------
        //2nd approach with priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            pq.add(a[i]);
        }
        long ans = 0;
        while(k>0){
            int bag = pq.poll();
            ans+=bag;
            pq.add(bag/2);
            k--;
        }
        return ans;
    }
};
