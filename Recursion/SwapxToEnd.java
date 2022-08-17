import java.util.*;

public class Practice {
  
  
  public static void moveToEnd(String s, int i, int count, String ans){
    
    if(i > s.length()-1){
      for(int j = 0; j<count; j++){
        ans += 'x';
        
      }
      System.out.println(ans);
      return ;
    }
    
    if(s.charAt(i) != 'x'){
      ans += s.charAt(i);
      moveToEnd(s,i+1, count, ans);
    }
    else{
      count += 1;
      moveToEnd(s,i+1, count, ans);   
    }
    
  }
  
  public static void main(String[] args) {
    String s = "axbcxxd";
    moveToEnd(s, 0, 0, "");
    
  }
}


//time complexity = O(n + n) = O(2n) = O(n).
