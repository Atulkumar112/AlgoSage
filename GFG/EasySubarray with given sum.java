 {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i=0,j=0;
        int sum = 0;
        
        if(s>0){
            while(i<n){
                sum += arr[i];
                
                if(sum > s){
                    while(sum>s){
                        sum -= arr[j++];
                    }
                }
                
                if(sum == s){
                    ans.add(j+1);
                    ans.add(i+1);
                    return ans;
                }
                i++;
            }
        }
            ans.add(-1);
            return ans;
    }
