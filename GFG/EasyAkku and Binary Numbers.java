
class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long L, long R){
        long ans=0;
        
        for(int i=0; i<63; i++){
            for(int j=i+1; j<63; j++){
                for(int k=j+1; k<63; k++){
                    long curr=0;
                    curr |=(1L<<i);
                    curr |=(1L<<j);
                    curr |=(1L<<k);
                    
                    if(curr>=L && curr<=R){
                        ans++;
                    }
                }
            }
        }
        
        
        return ans;
    }
    
}

//----------
//actaully i done this question by my own but it become in int type code(which is below ) and we need to make a code in long type 
class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long L, long R){
        String start = Integer.toBinaryString(L);
        String end = Integer.toBinaryString(R);
       
        Queue<String> q = new LinkedList<>();
        
        q.add(start);
        int n = R-L+1;
        String arr[] = new String[n];
        int i=0;
        while(n-->0) {
        	String s1 = q.peek();
        	
        	q.remove(s1);
        	arr[i]=s1;
        	String s2=s1;
        	q.add(s1+"0");
        	q.add(s2+"1");
        	i++;
        }
        int ans=0;
        for(int j=0; j<arr.length; j++) {
        	int count=0;
        	
        	for(int k=0; k<arr[j].length(); k++) {
        		
        		if(arr[j].charAt(k)=='1') {
        			count++;
        			
        		}
        	}
        	
        	if(count == 3) {
        		ans++;
        	}
        }
        System.out.println(Arrays.toString(arr));
        return  ans;
    }
}
