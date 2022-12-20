
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int maxDistance (int arr[], int n) {
        //Complete the function
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            // this logic is alos given in hints
            max1 = Math.max(max1, arr[i] + i); 
            min1 = Math.min(min1, arr[i] + i); 
            max2 = Math.max(max2, arr[i] - i); 
            min2 = Math.min(min2, arr[i] - i);
            
        }
        
        return Math.max(max1-min1, max2-min2);
        
        // Brute Froce approch:- time limit exceeded bcoz using O(N^2) TC
        // int ans=0;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         ans = Math.max(ans, Math.abs(arr[i]-arr[j])+(j-i));
        //     }
        // }
        // return ans;
    }
    
    
}


