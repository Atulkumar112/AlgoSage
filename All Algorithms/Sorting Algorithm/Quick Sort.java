/*Merge sort is more efficient and works faster than quick sort in case of larger array size or datasets. Quick sort is more efficient and works faster than merge
sort in case of smaller array size or datasets. Sorting method : The quick sort is internal sorting method where the data is sorted in main memory.
*/

//So avarage time complexity of this quick sort it O(nlogn) and the worse time complexity of this
//alog is O(n^2). Worse time complexity condition occures when our pivot element is always 
//smallest or largest element in array. for  ex:- [1, 2, 3, 4, 5, 6] here if we assign the pivot element
// as a last element then pivot element value always have largest element.
// this quick sort algorithm is also based on divide and conqure based technique 

public class GroupDis {
	
	public static int partition(int[] arr, int low , int high) {
		int pivot = arr[high];
		int i=low-1;
		for(int j=low; j<high; j++) {
			if(arr[j]<pivot) {
				// now swap
				i++;
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		i++;
		int temp = arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		
		return i;  //this ith index is my pivot index where i need to divide it...
		
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pidx = partition(arr, low, high);   // this function help us to placed the pivot element at correct position.
			
			quickSort(arr, low, pidx-1);     // this is divide the array when we placed the pivot at right postion 
			quickSort(arr, pidx+1, high);    // this is also divide the array when we placed the pivot at right postion 
			
		}
	}
	
	public static void main(String[] args) {	
		int[] arr = {6,3,9,5,2,8};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		
		System.out.println("Array sorted by Quick sort algorithm:---");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


