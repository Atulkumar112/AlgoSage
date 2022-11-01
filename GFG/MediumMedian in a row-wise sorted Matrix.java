class Solution {
    int median(int m[][], int R, int C) {
        //below time compexity is O(n2 + nlogn) and it is not a good approch
//         int[] arr = new int[R*C];
//         int idx=0;
// 		for(int i=0; i<R; i++) {
// 			for(int j=0; j<C; j++) {
// 				arr[idx++]=m[i][j];
// 			}
// 		}
		
//         Arrays.sort(arr);
// 		int len = R*C;

// 		if(len%2 != 0) {
//         	return arr[len/2];
//         }
//         else {
//         	int mid = (arr[len/2] + arr[(len/2)-1])/2;
//         	return mid;
//         }
        
        // let me do this question with the help of binary search algorithm (see hint)
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<R; i++){
            if(m[i][0]<min) min = m[i][0];
            if(m[i][C-1]>max) max = m[i][C-1];
            
        }
        
        int desired = (R*C +1)/2;
        
        while(min<max){
            int mid = (min+max)/2;
            
            int smaller = 0;
            for(int i=0; i<R; i++){
                int l=0;
                int r=C-1;
                while(l<r){
                    int m1=(l+r)/2;
                    if(m[i][m1]<=mid){
                        l=m1+1;
                    }
                    else{
                        r=m1;
                    }
                }
                smaller+=l;
                if(m[i][l]<=mid) smaller++;
            }
            
            if(smaller<desired){
                min = mid+1;
            }
            else{
                max=mid;
            }
        }
        return min;
    }
}
