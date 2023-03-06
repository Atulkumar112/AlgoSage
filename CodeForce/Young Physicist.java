
import java.util.*;

public class Codeforce {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int sum=0;
		boolean b=false;
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<n; i++) {
				sum += arr[i][j];
			}
			if(sum==0) {
				b=true;
			}
			else {
				b=false;
				break;
			}
		}
		
		if(b) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}
}


