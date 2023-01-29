import java.util.*;

public class Codeforce {
	public static void main(String[] args){
		System.out.println("Enter the value:- ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<Character> list = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			if(!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));
			}
			
		}
		
		int c = list.size();
		if(c%2 ==0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}
}
