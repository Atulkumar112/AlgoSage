import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> nums, int n){
        // Write your code here.
        // below code is my code and it's not able to pass the last one test case.
//         Collections.sort(arr);
//         for(int i=0; i<arr.size()-1; i++){
//             if(arr.get(i)==arr.get(i+1)){
//                   return arr.get(i);
//             }
            
//         }
//         return -1;
        
        //--------
        int low = 1, high = nums.size() - 1;
    while (low <= high) {
        int mid = (int) (low + (high - low) * 0.5);
        int cnt = 0;
        for (int a : nums) {
            if (a <= mid) ++cnt;
        }
        if (cnt <= mid) low = mid + 1;
        else high = mid - 1;
    }
    return low;
    }
}
