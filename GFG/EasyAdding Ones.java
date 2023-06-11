class Solution {

    public static void update(int a[], int n, int updates[], int k)
    {
        // Your code goes here
        for(int i=0; i<updates.length; i++){
            if(updates[i]<=n){
                for(int j=updates[i]-1; j<n; j++){
                    a[j]++;
                }    
            }
            
        }
    }
    
}
