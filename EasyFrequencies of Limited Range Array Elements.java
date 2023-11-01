
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=1;i<=N;i++){
            hm.put(i,0);
        }
        
        for (int i=0;i<N;i++){
            if (hm.containsKey(arr[i])){
                
                hm.put(arr[i],hm.get(arr[i])+1);
                
            }
           
        }
          int j=0;  
            for (int i:hm.values()){
                arr[j++]=i;
                
                //System.out.print(i+" ");
            }
        
    }
}

