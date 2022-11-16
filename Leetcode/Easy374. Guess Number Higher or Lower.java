/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // below test case is written by me but it is passing 20 test cases out of 25 but my code is looking good and you know now i am writting this code in train :)
        //1 2 3 4 5 6 7 8 9 10
        

       int low=1, high=n;
        
        while(low<=high){
            int mid = low+(high-low)/2;   // Is line ka khel h sara
            // if i write (low+high)/2 then it pass 20 test case and time limit exceed but when i write low+(high-low)/2 then it got successed :,)
            int g = guess(mid);
            if(g==0){
                return mid;
            }
            else if(g==1){
                low=mid+1;
            }
            else if(g==-1){
                high = mid-1;
            }
        }
        
        return -1;
        
        
    }
}



////////////////////---------------------------- copy paste 
// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//         int l = 1, m, pick;
//         while(l <= n) {
//             m = l + (n - l) / 2;
//             pick = guess(m);            
//             if(pick == 0)
//                 return m;
//             else if (pick == -1)
//                 n = m - 1;
//             else 
//                 l = m + 1;
//         }
//         return 0;
//     }
// }
