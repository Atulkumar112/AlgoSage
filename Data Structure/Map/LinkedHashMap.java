//LinkedHashMap is very useful when you need to store the key values as a insrting order in map. HashMap is stroed the keys as a random order.
//Example:- 
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(Map.Entry hm: map.entrySet()){
            if((int) hm.getValue() == 1){
                return (char) hm.getKey();
            }
            // System.out.println(hm.getKey()+ " --> "+ hm.getValue());
        }
        
        return '$';
    }
}

//Output
// h --> 1
// e --> 1
// l --> 2
// o --> 1
