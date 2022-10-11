public class Main
{
	public static void main(String[] args) {
		int n=5;
        for(int i=1; i<=n; i++){
            System.out.println();
            
            for(int k=n; k>i; k--){
                System.out.print(" ");     
            }
            
            for(int j=0; j<i; j++){
                System.out.print(" "+"*");        
            }
            
        }
	}
}

//
    *
   * *
  * * *
 * * * *
* * * * *
