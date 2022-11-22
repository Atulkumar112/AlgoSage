class Solution{
    public int countTriplets(int[] arr){
        // code here
        int n= arr.length;
        int ans = 0;
        for(int j=1; j<n-1; j++){
            int smaller = 0;
            
            for(int i=j-1; i>=0; i--){
                if(arr[i]<arr[j]){
                    smaller++;
                }
            }
            int larger=0;
            
            for(int k=j+1; k<n; k++){
                if(arr[k]>arr[j]){
                    larger++;
                }
            }
        
            ans += smaller*larger;
        }
        
        return ans;
        //below code is taken O(n^3) TC but expected TC should be O(n^2) below code is 
        // passing 130 test cases out of 140 so lets optimize the code.....
        /*int ans=0;
		if(arr.length <3) return 0;
		
		for(int i=0; i<arr.length-2; i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr.length; k++) {
					if(arr[i]<arr[j] && arr[j]<arr[k] && i<j && j<k) {
						ans++;
					}
				}
			}
		}
		return ans;
		*/
    }
}
