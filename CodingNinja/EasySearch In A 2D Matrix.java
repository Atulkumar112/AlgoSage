import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m, int target) {
		for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat.get(i).get(j)==target){
                    return true;
                }
            }
        }
        
        return false;
	}
}
