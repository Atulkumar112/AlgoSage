import java.util.*;

public class Main {
  public String reverseWords(String s) {
        if(s.length() == 0) return s;
        char[] arr = s.toCharArray();
        
        int start = 0;
       for(int i=0; i<arr.length; i++){
            if(arr[i] ==' '){
                swap(arr, start, i-1);
                start = i+1;     
            } 
            else if(i == arr.length-1){
              swap(arr, start, i);
            }
       }
        return new String(arr);
    }
    
    public void swap(char[] arr, int start, int end){
      
            while(end>start){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }

    public static void main(String[] args) {
      String s = "God Ding";
      Main obj = new Main();
      System.out.println(obj.reverseWords(s));
  }
}
