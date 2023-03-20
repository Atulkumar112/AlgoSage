// this code is build by me and i see the two test cases to complete this code
// TC:- O(N)
// class Solution {
//     public boolean canPlaceFlowers(int[] flower, int n) {
//         int len = flower.length;
//         if(len==1 && n==1 && flower[0]==0) return true;
//         if(n==0) return true;
//         for(int i=0; i<len; i++){
//             if(flower[i]==0){
//                 if(i-1>=0 && i+1<len){
//                     if(flower[i-1]==0 && flower[i+1]==0){
//                         flower[i]=1;
//                         n--;
                        
//                     }
//                 }
//                 else if(i-1>=0){
//                     if(flower[i]==0 && flower[i-1]==0){
//                         flower[i]=1;
//                         n--;
//                     }
//                 }
//                 else if(i+1<len){
//                     if(flower[i]==0 && flower[i+1]==0){
//                         flower[i]=1;
//                         n--;
//                     }
//                 }
//             }
            
//             if(n==0){
//                 break;
//             }
//         }
//         return n==0?true:false;
//     }
// }

//---------From solution tab, Second approach with same TC and SC
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++) {
            if(flowerbed[i] == 0) {
	     //get next and prev flower bed slot values. If i lies at the ends the next and prev are considered as 0. 
               int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
               int prev = (i == 0) ? 0 : flowerbed[i - 1];
               if(next == 0 && prev == 0) {
                   flowerbed[i] = 1;
                   count++;
               }
            }
        }
        
        return count == n;
    }
}
