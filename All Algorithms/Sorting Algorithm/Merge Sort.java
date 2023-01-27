/*
Merge sort is more efficient and works faster than quick sort in case of larger array size or datasets. Quick sort is more efficient and works faster than merge
sort in case of smaller array size or datasets. Sorting method : The quick sort is internal sorting method where the data is sorted in main memory.

*/

//So total time complexity of this merge sort it O(nlogn)
// this merge sort algo is based on divide and conqure based technique 

public class MergeSort {
	//Conqure, it's taken the O(n) time complexity 
	public static void conqure(int[] arr, int si, int mid, int ei) {
		int[] merged = new int[ei-si+1];
		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;
		
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<=arr[idx2]) {
				merged[x++]=arr[idx1++];
			}
			else {
				merged[x++]=arr[idx2++];
			}
		}
		
		while(idx1<=mid) {
			merged[x++]=arr[idx1++];
		}
		
		while(idx2<=ei) {
			merged[x++]=arr[idx2++];
		}
		
		for(int i=0, j=si; i<merged.length; i++, j++) {
			arr[j]=merged[i];
		}
	}
	
	
	//Divide taken the time complexity logn
	public static void divide(int[] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int mid = si+(ei-si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		
		conqure(arr, si, mid, ei);
		
		
	}
	public static void main(String[] args) {	
		int[] arr = {6,3,9,5,2,8};
		int n = arr.length;
		divide(arr,0, n-1);
		
		System.out.println("Array sorted by merge sort algorithm:---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

