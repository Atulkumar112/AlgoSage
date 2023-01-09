import java.util.*;

public class Codeforce{
	public static void main(String[] args) {
		System.out.println("Enter the value:- ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		
		if(str1.compareTo(str2)==0) {
			System.out.println("0");
		}
		else if(str1.compareTo(str2)>0) {
			System.out.println("1");
		}
		else {
			System.out.println("-1");
		}
	}
	
}
