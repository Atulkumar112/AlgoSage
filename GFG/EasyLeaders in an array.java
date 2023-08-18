class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        int val = arr[arr.length-1];
        list.add(val);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] >= val){
                list.add(arr[i]);
                val = arr[i];
            }
        }
        
        Collections.reverse(list);
        
        return list;
    }
}
