import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
       int j=0;
//        System.out.println(Arrays.toString(arr1));
       for(int i=m; i<m+n; i++) {
           arr1[i]=arr2[j];
           j++;
       }
       
       Arrays.sort(arr1);

       return arr1;
        
    }
}
