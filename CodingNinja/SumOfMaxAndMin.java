import java.util.*;
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      List<Integer> list = new ArrayList<Integer>();
      for(int i=0; i<arr.length; i++){
          list.add(arr[i]);
      }
      Collections.sort(list);
      int a = list.get(0);
      int b = list.get(arr.length-1);
      return a+b;
  }
}
