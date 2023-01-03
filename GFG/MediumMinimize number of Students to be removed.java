
class Solution {
    public int removeStudents(int[] arr, int n) {
        //below code is show time limit exceeded because i am using O(N^2) and 140/145 
        //test cases passed
        // int[] dp = new int[n];
        // Arrays.fill(dp, 1);
        // int ans=1;
        // for(int i=1; i<n; i++){
        //     for(int j=0; j<i; j++){
        //         if(arr[i]>arr[j] && dp[j]+1>dp[i]){
        //             dp[i]=dp[j]+1;
        //             ans = Math.max(ans, dp[i]);
        //         }
        //     }
        // }
        
        // return n-ans;
        
        //
        List<Integer> dp = new ArrayList<>();
        for(int i=0; i<n; i++){
            int idx = binarySearch(arr[i], dp);
            if(idx==dp.size()){
                dp.add(arr[i]);
            }
            else{
                dp.set(idx, arr[i]);
            }
            
        }
        
        return n-dp.size();
        
    }
    public int binarySearch(int ele, List<Integer> dp){
            int l=0, r=dp.size()-1;
            while(l<=r){
                int mid = (l+r)/2;
                if(dp.get(mid)>=ele){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return l;
        }
};
