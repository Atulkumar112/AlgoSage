/* Bubble sort is a sorting algorithm, which sort the element in n^2 time. In this algorithm first we will compare the ith and i+1 element and if ith element is 
larger than the i+1 element then we swap to each other. it's swaping of the element run the n^2 times. and it's called the bubble sort algorithm. 
*/

public class BobbleSort {	
	public static void main(String[] args) {	
		int[] arr = {7,8,3,1,2};
		int n=arr.length;
		sorting(arr, n);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void sorting(int[] arr, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//----------------------------OR------------------------
		// this is the sharadha (apna college) for looping
//		for(int i=0; i<n-1; i++) {
//			for(int j=0; j<n-i-1; j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
	}
}
