class Solution {
    public String[] sortPeople(String[] name, int[] h) {
        Map<Integer, String> map = new HashMap<Integer, String>();
    
    for(int i=0; i<name.length; i++){
      map.put(h[i], name[i]);
    }
    
      //it just printing the hash map 
    for(Map.Entry m: map.entrySet()){
      System.out.println(m.getKey()+"-->"+m.getValue());
    }
  
    String[] ans = new String[map.size()];  
    //=========================================
    TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (map);  
    Iterator itr=tm.keySet().iterator();               
    int i=0;
    while(itr.hasNext())    
    {    
    int key=(int)itr.next();  
    System.out.println("Roll no:  "+key+"     name:   "+map.get(key));  
    ans[i] = map.get(key);
    i++;
    } 
    
    Collections.reverse(Arrays.asList(ans));
    return ans;
    }
}
