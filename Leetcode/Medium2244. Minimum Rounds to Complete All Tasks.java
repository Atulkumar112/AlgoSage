class Solution {
    public int minimumRounds(int[] tasks) {
        // int ans=0;
		// Map<Integer, Integer> hm = new HashMap<>();
		// for(int i=0; i<arr.length; i++) {
		// 	hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		// }
		
		// for(Map.Entry v: hm.entrySet()) {
		// 	int val = (int) v.getValue();
		// 	while(val>0) {
		// 		if(val==1) {
		// 			ans=-1;
		// 			break;
		// 		}
		// 		if(val%2==0) {
		// 			if(val>=2) {
		// 				val-=2;
		// 				ans++;
		// 			}
		// 		}
		// 		else {
		// 			if(val>=3) {
		// 				val-=3;
		// 				ans++;
		// 			}
					
		// 		}
		// 	}
		// 	if(ans==-1) {
		// 		break;
		// 	}
			
		// }
		// return ans;

        //----------------------------------------------------
        Map<Integer,Integer> freq=new HashMap<>();
        for(Integer task:tasks){
            freq.put(task,freq.getOrDefault(task,0)+1);
        }
        int res=0;
        for(Integer count:freq.values()){
            if(count==1) return -1;
            res+=(count+2)/3;
        }
            return res;
        
    }
}
