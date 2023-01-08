
class Solution {
	static long countPairs(int n, int[] arr, int k) {
	    int[] mod = new int[k];
	    for(int i: arr){
	        int m = i%k;
	        mod[m]++;
	    }
	    
	    int ans=0;
	    for(int i:mod){
	        if(i!=0) ans+=i*(i-1)/2;
	    }
	    
	    return ans;
	    
		// the below code is written by me but time limit exceeded, 110.120 test case passed
// 		long ans=0;
// 		for(int i=0; i<arr.length-1; i++) {
// 			for(int j=i+1; j<arr.length; j++) {
// 				int diff = Math.abs(arr[i]-arr[j]);
// 				if(diff%k==0) {
// 					ans++;
// 				}
// 			}
// 		}
// 		return ans;
	}
}
