//GCD:- In Greatest common divisor, we need to find the max value which can be divide completly of given both values.
//ex:- a=27, b=3 so here 1 and 3 are only two digits who can divide completly of these a and b number so we take the maximum value which is 3 to answer would be 3.

public class LC {

      public static void main(String[] args) {
    	  int a=13;
    	  int b=5;
//    	  System.out.println(gcd(a, b));
    	  
    	  //---------------- OR ------------------
    	  
    	  //gcd = (a*b)/(lcm(a,b)) THIS IS THE FURMULA TO FINDING THE GCD.
    	  int ans = (a*b)/(lcm(a,b));
    	  System.out.println(ans);
    	 
      }
      
      // for finding the gcd using recursion 
      private static int gcd(int a, int b) {
    	  
    	  if(b!=0) {
    		  return gcd(b, a%b);
    	  }
    	  else {
    		  return a;
    	  }
      }
      
      
      
      // Method for calculating the LCM of two number
      private static int lcm(int a, int b) {
    	  int max = (a>b) ? a:b;
    	  
    	  while(true) {
    		  if(max%a==0 && max%b==0) {
    			  break;
    		  }
    		  max++;
    	  }
    	  return max;
      }	
		
}
