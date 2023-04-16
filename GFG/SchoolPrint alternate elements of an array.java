class GfG
{
    public static void print(int arr[], int n)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i=i+2){
            list.add(arr[i]);
        }
        
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
