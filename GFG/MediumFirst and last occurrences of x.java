//Time complexity is O(n) but we have to solve this question in O(logn) TC. 
class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int firstIndex = -1;
        int secondIndex = -1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                firstIndex=i;secondIndex=i-1;
                boolean b = false;
                
                while(i<n && arr[i]==x){
                    i++;
                    b = true;
                }
                if(b){
                    secondIndex=i-1;    
                }
                else{
                    secondIndex=i;
                }
                break;
            }
        
        }
        
        list.add(firstIndex);
        list.add(secondIndex);
        
        return list;
    }
    
    
    //
    //  ArrayList<Integer> find(int arr[], int n, int x)
    // {
    //     // code here
    //     int s=-1,e=-1;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==x && s==-1)  s=i;
    //         if(arr[arr.length-i-1]==x && e==-1)  e=arr.length-i-1;
    //     }
    //     ArrayList<Integer> a=new ArrayList<>();
    //     a.add(s);
    //     a.add(e);
    //     return a;
    // }
}
