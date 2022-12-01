class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        /*
        //maxi= stores the index of the max element in array

        //mini= stores the index of the min element in the array
        
        //me= stores the value of the (largest element in the array + 1)
        */
         int mini=0;

        int maxi=n-1;

        long max_ele=arr[n-1]+1;

        long me=max_ele;

        

        for(int i=0; i<n; i++){

            if(i%2==0){

                arr[i]= arr[i]+arr[maxi]%me*me;

                maxi--;

            }

            else{

                arr[i]= arr[i]+arr[mini]%me*me;

                mini++;

            }

        }

        

        for(int i=0; i<n; i++){

            arr[i]= arr[i]/me;

        }

        
        
//----------------------------------------------------------------        
        //Second Approach:-  below solution have passed but we have to do this problem without
        // leading extra space means SC should be O(1)
//         int i=0, j=n-1;
// 		List<Long> l = new ArrayList<>();
// 		while(i<j) {
// 			l.add(arr[j]);
// 			l.add(arr[i]);
// 			i++;
// 			j--;
			
// 		}
// 		if(n%2!=0) {
// 			l.add(arr[i]);
// 		}
		
// 		for(int k=0; k<n; k++) {
// 			arr[k] = l.get(k);
// 		}
        
 //-----------------------------------------------------------------------------------       
// first Approach:- bad solution because 44 test cases passed only out of 140 because TC is O(N^2)
//      int i=n, curr=0;
// 		while(n/2<i) {
// 			long temp = arr[n-1];
			
// 			for(int j=n-1; j>curr; j--) {
// 				arr[j]=arr[j-1];
// 			}
// 			arr[curr]=temp;
			
// 			curr = curr+2;
// 			i--;
// 		}
    }
    
}


