
class Solution {
    
    public void Rearrange(int arr[], int n)
    {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        
        
        int idx=0;
        for(int i=0; i<neg.size(); i++){
            arr[idx] = neg.get(i);
            idx++;
        }
        
        for(int i=0; i<pos.size(); i++){
            arr[idx] = pos.get(i);
            idx++;
        }
        
    
        
    }
}
