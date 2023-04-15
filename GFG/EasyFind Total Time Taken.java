
//TC:- O(N)  SC:- O(N)
class Solution
{
    public static long totalTime(int n,int arr[],int time[]){
        HashSet<Integer> hs = new HashSet<>();
        int sum=0;
        for(int i=0; i<n; i++){
            if(hs.add(arr[i])){
                hs.add(arr[i]);
            }
            else{
                sum+=time[arr[i]-1];    
            }
        }
        
        for(int i=0; i<hs.size(); i++){
            sum+=1;
        }
        
        return sum-1;   // i don't know why i did -1 but i did this code by 
        // my own 
    }
}
