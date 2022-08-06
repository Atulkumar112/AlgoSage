import java.util.*;
class Solution {
    //using Recursion 
	public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
    
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        if(n<0){
            System.out.println("Error");
        }
        else{
            System.out.println(factorial(n));                    
        }
      
        //without recursion 
//        int ans = n;
//       if(n == 0){
//           System.out.println("1");
//       }
//         else if (n < 0){
//             System.out.println("Error");
//         }
//         else{
//             for(int i=1; i<n; i++){
        
//           ans *=i;
//       }
//       System.out.println(ans);
//         }
      
    }
}
