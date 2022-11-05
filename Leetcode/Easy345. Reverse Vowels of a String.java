class Solution {
    public String reverseVowels(String s) {
        //code written by me :)
//         String v = "";
// 		List<Character> list  = new ArrayList<>();
// 		list.add('a');
// 		list.add('e');
// 		list.add('i');
// 		list.add('o');
// 		list.add('u');
        
//         list.add('A');
// 		list.add('E');
// 		list.add('I');
// 		list.add('O');
// 		list.add('U');
        
        
// 		for(int i=0; i<s.length(); i++) {
// 			if(list.contains(s.charAt(i))) {
// 				v = s.charAt(i) + v;
// 			}
// 		}
// 		int j=0;
		
		
// 		StringBuilder sb = new StringBuilder(s);
// 		for(int i=0; i<s.length(); i++) {
// 			if(list.contains(s.charAt(i))) {
// 				 sb.deleteCharAt(i);
// 				 sb.insert(i, v.charAt(j));
// 				 j++;
// 			}
// 		}
// 		return sb.toString();
//     }
    
    // below code is two pointer approach and very efficient code 
        if(s == null || s.length()==0) return s;
    String vowels = "aeiouAEIOU";
    char[] chars = s.toCharArray();
    int start = 0;
    int end = s.length()-1;
    while(start<end){
        
        while(start<end && !vowels.contains(chars[start]+"")){
            start++;
        }
        
        while(start<end && !vowels.contains(chars[end]+"")){
            end--;
        }
        
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        
        start++;
        end--;
    }
    return new String(chars);
    }
}
