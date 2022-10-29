//it's easy to understand 
class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, String contact[], String s)
    {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for(String st: contact){
            hs.add(st);
        }
        
        String str = "";
        for(int i=0; i<s.length(); i++){
            str += s.charAt(i);
            ArrayList<String> temp = new ArrayList<>();
            
            for(String itr: hs){
                if(itr.length() < str.length()){
                    continue;
                }
                else if(itr.length() == str.length() && str.equals(itr)){
                    temp.add(itr);
                }
                else if(itr.length()>str.length() && str.equals(itr.substring(0, i+1))){
                    temp.add(itr);
                }
            }
            if(temp.size() ==0){
                temp.add("0");
            }
            Collections.sort(temp);
            ans.add(temp);
        }
        
        return ans;

    }
}
