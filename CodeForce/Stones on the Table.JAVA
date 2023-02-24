import java.util.*;

public class Codeforce {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
    // Below is my code and it's running only 9 test cases
		//BRBG
//		int max=0;
//		int j=0;
//		int curr=0;
//		for(int i=1; i<n; i++) {
//			
//			if(s.charAt(i)==s.charAt(j)) {
//				curr++;
//			}
//			else {
//				max = Math.max(max, curr);
//				curr=0;
//				j=i;
//			}
//		}
//		max = Math.max(max, curr);
//		System.out.println(max);
		
    
    // below is the youtube solution 
		int ans=0;
		for(int i=1; i<n; i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
	
}


