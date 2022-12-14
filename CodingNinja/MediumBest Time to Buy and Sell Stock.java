import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> list)    {
        int n = list.size();
        List<Integer> max = new ArrayList<>();
        max.add(list.get(n-1));
        for(int i=n-2; i>=0; i--) {
            if(max.get(max.size()-1) < list.get(i)) {
                max.add(list.get(i));
            }
            else {
                max.add(max.get(max.size()-1));
            }
        }
        
        Collections.reverse(max);
        int ans=0;
        for(int i=0; i<n; i++) {
            int diff = Math.abs(list.get(i)-max.get(i));
            ans = Math.max(ans, diff);
        }
        
        return ans;
        
        
        // time limit exceeded :(
//         int n = p.size(), buy=0, sell=0, ans=0;
//         for(int i=0; i<n-1; i++) {
//             buy=p.get(i);
//             for(int j=i+1; j<n; j++) {
//                 if(buy<p.get(j)) {
//                     int diff = p.get(j)-buy;
//                     ans = Math.max(diff, ans);  
//                 }
//             }
//         }
//         return ans;
    }
}
