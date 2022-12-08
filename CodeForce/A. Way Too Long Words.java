import java.util.*;
 
public class WayTooLongWords {
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			String w = sc.next();
			int len = w.length();
			if(len>10) {
				System.out.println(""+w.charAt(0)+(len-2)+w.charAt(len-1));
			}
			else {
				System.out.println(w);
			}
		}		
	}
}
