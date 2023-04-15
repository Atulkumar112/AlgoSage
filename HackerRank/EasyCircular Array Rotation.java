
class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> q) {
    // Write your code here
    List<Integer> list = new ArrayList<>();
    int n = a.size();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = a.get(i);
    }
    while(k-->0){
        int temp1 = arr[0];
        for(int i=1; i<n; i++){
            int temp2 = arr[i];       
            arr[i] = temp1;
            temp1 = temp2;
        }
        arr[0] = temp1;
    }
    
    for(int i=0; i<q.size(); i++){
        list.add(arr[q.get(i)]);
    }
    return list;

    }

}
