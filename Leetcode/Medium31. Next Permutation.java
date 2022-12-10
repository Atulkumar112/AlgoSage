// trust me it is really very easy solution ever

class Solution {
    public void nextPermutation(int[] arr) {
        int idx1 =-1;
		int idx2 = -1;
		//step 1
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i]<arr[i+1]) {
				idx1 = i;
				break;
			}
		}
		
		//step 2
		for(int j=arr.length-1; j>=0; j--) {
			if(idx1!=-1 && arr[j]>arr[idx1]) {
				idx2=j;
				break;
			}
			
		}
		
		//step 4 swaping
        if(idx1 != -1){
            swap(arr, idx1, idx2);
        }
		
		
		//sorting  
		Arrays.sort(arr, idx1+1, arr.length);
    }

    public void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
