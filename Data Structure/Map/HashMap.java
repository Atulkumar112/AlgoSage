//Just for Example **************************************************
import java.util.*;

public class Main {
  public static String[] sorted(String[] name, int[] h){
  //initialize a hashmap
    Map<Integer, String> map = new HashMap<Integer, String>();
    
    //we have given two array of string and int type so we put all the values of both array in a map as a 
    //key value pair with the help of for loop
    for(int i=0; i<name.length; i++){
      map.put(h[i], name[i]);
    }
    
    //This for loop is use for printing a data of hashmap
    for(Map.Entry m: map.entrySet()){
      System.out.println(m.getKey()+"-->"+m.getValue());
    }
  
  
    String[] ans = new String[map.size()];  
    //=========================================
    //initializing a treemap for containing the value as a sorted form 
    TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (map);  
    //initializing a iterator interface 
    Iterator itr=tm.keySet().iterator();               
    int i=0;
    while(itr.hasNext())    
    {    
    int key=(int)itr.next();  
    System.out.println("Roll no:  "+key+"     name:   "+map.get(key));  
    ans[i] = map.get(key);
    i++;
    } 
    
    //for reverse a array 
    Collections.reverse(Arrays.asList(ans));
    System.out.println(Arrays.asList(ans));
    
    return ans;
  }
    public static void main(String[] args) {
      String[] names = {"Mary","John","Emma"};
      int[] heights = {180,165,170};
      System.out.println(Arrays.toString(sorted(names, heights)));
  }
}
//*****output************************
180-->Mary
165-->John
170-->Emma
Roll no:  165     name:   John
Roll no:  170     name:   Emma
Roll no:  180     name:   Mary
[Mary, Emma, John]
[Mary, Emma, John]
//****************************************

----------------------------Methods----------------
--> .containsKey(_);   return boolean value
--> .size()  get length of map
--> .get(_key_);  get the value of a given key
--> .getOrDefault(key, 0); this method is used when we have doubt like HashMap have not key then it will return a default value 
which we assigned 0
--> hm.computeIfAbsent(key, k -> new ArrayList()).add(arr[i]);  we use this type property when we have same key but diff. values which we want to store in List.
  EX:- -------
  class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            hm.computeIfAbsent(key, k -> new ArrayList()).add(strs[i]);
        }

        return new ArrayList(hm.values());
    }
  }
  Input:- strs = ["eat","tea","tan","ate","nat","bat"]
  Output:- [[eat, tea, ate], [bat], [tan, nat]]
  
 ---> .keySet() method for getting all key of hash map.............->
    Ex:-- for(int key: map.keySet()){
              if(map.get(key) !=0 ) return false;    
          }

