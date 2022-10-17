// the below code written by me but it is showing time limit exceed because it need TC is O(n*logn) and my code have O(n^2) TC
// class Solution {
//     public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<Integer> con = new ArrayList<>();
        
        // for(int i=0; i<n-1; i++){
        //     int min=Integer.MAX_VALUE;
        //     boolean b=false;
        //     for(int k=i+1; k<n; k++){
        //         // if(con.get(i) < con.get(k)){
        //         //     min=Math.min(min, con.get(k));
        //         //     b=true;
        //         // }
        //         if(arr[i] < arr[k]){
        //             min=Math.min(min, arr[k]);
        //             b=true;
        //         }
        //     }
        //     if(b){
        //         list.add(min);    
        //     }
        //     else{
        //         list.add(-1);
        //     }
            
        // }
        // list.add(-1);
        
//         int i=0;
//         int j=0; k
//         while()
//         return list;
//     }
// }


class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        TreeSet<Integer> s = new TreeSet<>();// inbuilt function for next least grater element
        
        for(int i=n-1;i>=0;i--){
          s.add(arr[i]);
          if(s.higher(arr[i]) == null)
           ans.add(-1);
           else
           ans.add(s.higher(arr[i]));
        }
        Collections.reverse(ans);
        return ans;
    }
}
        
