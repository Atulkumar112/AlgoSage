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
