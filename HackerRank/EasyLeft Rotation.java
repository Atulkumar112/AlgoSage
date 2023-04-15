class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // below code have TC:- O(N+D) that why it's showing TLE
        // int n= list.size();
        // int[] arr = new int[n];
        
        // for(int i=0; i<n; i++){
        //     arr[i]=list.get(i);
        // }
        
        // while(d-->0){
        //     int temp1 = arr[n-1];
        //     for(int i=n-2; i>=0; i--){
        //         int temp2 = arr[i];
        //         arr[i] = temp1;
        //         temp1 = temp2;
        //     }
        //     arr[n-1] = temp1;
        //     System.out.println(Arrays.toString(arr));
        // }
                
        // List<Integer> ans= new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     ans.add(arr[i]);
        // }

        // return ans;
        
        //--------------------------------
        for(int i=0;d<arr.size();i++){
            int temp=arr.remove(d);
            arr.add(i,temp);
            d++;
        }
       return arr;
        //-----------------OR-----------------
        //  d = d % arr.size();
        // while(d-- > 0){
        //     arr.add(arr.remove(0));
        // }
        // return arr;
    }
}
