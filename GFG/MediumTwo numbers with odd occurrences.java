class Solution
{
    public int[] twoOddNum(int arr[], int N)
    {
        Map<Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());  /*treeMap is sortd 
        assending order by default that's why we used treeMap insted of hashMap(Contains the 
        ranom value) but we need the answer in desending order so that's why we writtrn 
        Collections.reverse() in my treeMap
      */
      
      for(int i=0; i<N; i++){
          tm.put(arr[i], tm.getOrDefault(arr[i], 0)+1);
      }
      
      int[] ans = new int[2]; int k=0;
      
      for(int x: tm.keySet()){
          if(tm.get(x)%2 != 0){
              ans[k++] = x;
          }
      }
      return ans;
    }
}
