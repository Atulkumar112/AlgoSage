
class Solution {
    public long minIncrements(int[] arr, int n) {
        int count=0;
		if(n==1) return 0;
		Set<Integer> set = new HashSet<>();
		int i=0;
		while(i<n) {
			
			if(i>=0 && set.add(arr[i])) {
				set.add(arr[i]);
				i++;
			}
			else if(i>=0){
				arr[i]++;
				count++;
				
			}			
		}
		
		return count;
        //--------------------------------------------------------------------
        // below code is written by me and 112/162 test case passed but after it time
        // limit exceeded... The TC is O(nlogn)
//         int count=0;
// 		if(n==1) return 0;

// 		int i=1;
// 		while(i<n) {
//             Arrays.sort(arr);
// 			if(i>0 && arr[i-1]==arr[i]) {
// 				arr[i]++;
// 				count++;
// 				i--;
// 			}
// 			else {
// 				i++;
// 			}
// 		}
// 		return count;
    }
}
