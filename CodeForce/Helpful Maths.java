
import java.util.*;

public class Codeforce {
	public static void main(String[] args) throws Exception{
// 		System.out.println("Enter the value:- ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!='+') {
				list.add(s.charAt(i)-'0');
			}
		}
		Collections.sort(list);
		String ans="";
		for(int i=0; i<list.size()-1; i++) {
			ans+=list.get(i)+"+";
		}
		ans+=list.get(list.size()-1);
		System.out.println(ans);
	}
}
