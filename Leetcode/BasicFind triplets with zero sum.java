
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //navie approach O(n^3)
        // int sum = 0;
        // Arrays.sort(arr);
        // for(int i=0; i<n-2; i++){
        //     int a = arr[i];
        //     for(int j=i+1; j<n-1; j++){
        //         int b = arr[j];
        //         for(int k=j+1; k<n; k++){
        //             int c = arr[k];
        //             sum = a+b+c;
        //             if(sum==0){
        //                 return true; 
        //             }
        //         }
        //     }
        // }
        // return false;
        
        int sum = 0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int j=i+1;
            int k=n-1;
            int a = arr[i];
            while(j<k){
                int b = arr[j];
                int c = arr[k];
                sum = a+b+c;
                if(sum==0){
                    return true;
                }
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
            }
        }
        
        return false;
    }
}
