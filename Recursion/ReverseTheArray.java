import java.util.*;
public class Solution{

    public static void reversingArray(ArrayList<Integer> arr, int l, int r){
        if(l>=r) return ;
        
        Collections.swap(arr, l, r);
        
        reversingArray(arr, l+1, r-1);
    }
    
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
          reversingArray(arr, m+1, arr.size()-1);
    }
}
