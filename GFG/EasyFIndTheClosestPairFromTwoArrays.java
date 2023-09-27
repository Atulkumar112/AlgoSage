//User function Template for Java

// class Solution{
//     // Function for finding maximum and value pair
//     public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
//         // code here
//         Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        
//         int i=0;
//         int j=brr.length-1;
        
//         while(i<arr.length && j>=0){
//             int sum = arr[i] + brr[j];
//             int diff = Math.abs(sum - x);
//             map.put(diff, new int[] {arr[i], brr[j]});
            
//             if(diff < 0 ){
//                 i++;
//             }
//             else if(diff > 0){
//                 j--;
//             }
//             else{
//                 break;
//             }
//         }
        
//         int min = Integer.MAX_VALUE;
//         ArrayList<Integer> list = new ArrayList<>();
//         for(Map.Entry<Integer, int[]> myMap: map.entrySet()){
//             if((int)myMap.getKey() < min){
//                 min = (int) myMap.getKey();
//             }
//         }
        
//         // list = Arrays.asList(map.get(min));
//         System.out.println(map.get(min));        
//         return list;
//     }
// }

class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = m - 1;
        int a = -1, b = -1;
        while(i<n && j>=0){
            int sum = arr[i] + brr[j];
            int diff = Math.abs(x - sum);
            if(diff < min){
                min = diff;
                a = arr[i];
                b = brr[j];
            }
            if(sum > x)
            j--;
            else if(sum < x)
            i++;
            else
            break;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
