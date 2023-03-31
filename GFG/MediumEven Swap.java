// below code i run by me and TC is O(nlogn)
// class Solution{
// 	int [] lexicographicallyLargest(int [] arr, int n) {
//         int[] ans = new int[n];
//         int j=0;
//         for(int i=0; i<n; i++){
//             ans[i]=arr[i];
//         }
//         Arrays.sort(ans);
//         int[] res = new int[n];
//         int idx=0;
//         for(int i=n-1; i>=0; i--){
//             res[idx]=ans[i];
//             idx++;
//         }
        
//         for(int k=0; k<n; k++){
//             for(int i=0; i<n-1; i++){
//                 j=i+1;
//                 if(arr[i]<arr[j] && (arr[i]+arr[j])%2==0){
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }    
//         }
        
//         return arr;
// 	}
// }

//---------------------------------------------------------------------------
class Solution{
	int [] lexicographicallyLargest(int [] a, int n) {
		//Write your code here
		int s = 0; // start
        int e = -1; // end
        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && (a[i] + a[i + 1]) % 2 == 0) {
                e = i + 1; // if it is true just keep increasing the range
            } else {
                if (e == -1) {
                    // single element
                    result[k++] = a[s];
                } else {
                    // multiple elements
                    int[] subArray = Arrays.copyOfRange(a, s, e + 1);
                    Arrays.sort(subArray);
                    for (int j = subArray.length - 1; j >= 0; j--) {
                        result[k++] = subArray[j];
                    }
                }
                s = i + 1;
                e = -1;
            }
        }
        return result;
	}
}
