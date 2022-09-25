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
--> 
