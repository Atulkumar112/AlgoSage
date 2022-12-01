class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length()/2);
      String b = s.substring(s.length()/2);
      int ans=0;

      List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

      for(int i=0; i<a.length(); i++) {

        if(list.contains(a.charAt(i))){
          ans++;
        }
        if(list.contains(b.charAt(i))){
          ans--;
        }	
      }
      return ans==0;
      }
}
