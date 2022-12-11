import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        for(Map.Entry m: hm.entrySet()){
            //Map.Entry m: map.entrySet())
            int val = (int) m.getValue();
            if(val>n/2){
                return (int) m.getKey();
            }
        }
        return -1;
	}
}
