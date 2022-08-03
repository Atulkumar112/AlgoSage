//  1 2 3 4 5 
//  1 2 3 4 
//  1 2 3 
//  1 2 
//  1
//without recursion 
public class pattern1{
  public static void main(String[] args) {
    int n = 5;
    
    for(int i=n; i>0; i--){
      System.out.println(" ");
      for(int j=1; j<=i;j++){
        System.out.print(" "+ j);
      }
    } 
  }
}
