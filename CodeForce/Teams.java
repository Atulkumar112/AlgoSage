import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Team {
	
	public static void main(String[] args) throws Exception{
		System.out.println("enter");
		int count=0;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		for(int i=0; i<q; i++) {
			String[] parts = br.readLine().split(" ");
			int p = Integer.parseInt(parts[0]);
			int y=Integer.parseInt(parts[1]);
			int t=Integer.parseInt(parts[2]);
			if(p==1 && y==1 || y==1 && t==1 || t==1 && p==1) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}


/*
 * 
 * 
first test case
3
1 1 0
1 1 1
1 0 0

Second test case
2
1 0 0
0 1 1

 */
