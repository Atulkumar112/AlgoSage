class Solution {
    String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> ans = new HashSet<>();
        
        for(String s: words){
            StringBuilder sb = new StringBuilder();
            for(char c: s.toCharArray()){
                sb.append(morse[c-'a']);    
            }
            ans.add(sb.toString());
            
        }
    
        return ans.size();   
    }
}
