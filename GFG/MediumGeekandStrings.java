class Solution{
    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
        
        //-------Below code i written by me but it is passing only 4 test cases out off 15 
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0; i<Q; i++){       
        //     int count=0;
        //     for(int j=0; j<N; j++){
        //         if(li[j].startsWith(q[i])){
        //             count++;
        //         }
        //     }
        //     ans.add(count);
        // }
        // return ans;
        //-------------------------Below code will work
        // code here
        List<Integer> ans =new ArrayList<>();
        HashMap<String,Integer> map =new HashMap<>();
        for(String i : li){
            String s="";
            for(int j=0;j<i.length();j++){
                s+=i.charAt(j);
                map.put(s , map.getOrDefault(s,0)+1);
            }
        }
        for(String i : query){
            ans.add(map.getOrDefault(i ,0 ));
        }
        return ans;
    }
}
// li[] = {'abracadabra', 'geeksforgeeks','abracadabra', 'geeks', 'geeksthrill'}
// query[] = {'abr', 'geeks', 'geeksforgeeks','ge', 'gar'}
