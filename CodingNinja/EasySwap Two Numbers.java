import java.util.* ;
import java.io.*; 
import javafx.util.Pair;

public class Solution {
    public static Pair < Integer, Integer > swap(Pair < Integer, Integer > swapValues) {
        // Write your code here.
        Pair<Integer, Integer> ans = new Pair<>(swapValues.getValue(), swapValues.getKey());
        return ans;
        
    }
}
