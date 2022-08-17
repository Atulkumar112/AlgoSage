import java.util.*;

public class Practice {
  public static boolean checkReverse(int[] arr, int len, int i){
    if(i == len-1){
      return true;
    }
    
    if(arr[i] >= arr[i+1]){
      return false;
    }
    else{
      return checkReverse(arr, len, i+1);
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,4};
    System.out.println(checkReverse(arr, arr.length, 0));
  }
}
