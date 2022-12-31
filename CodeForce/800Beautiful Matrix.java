import java.util.*;

public class Codeforce{
	 		  
	public static void main(String[] args) {
		System.out.println("sjfkd");
		Scanner sc = new Scanner(System.in);
		int n=5;
		int[][] grid = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				grid[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(grid[i][j]==1) {
					
					int r = Math.abs(2-i);
					int c = Math.abs(2-j);
					System.out.println(r+c);
					break;
				}
			}
		}		
	}
}
