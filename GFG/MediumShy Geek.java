
//User function Template for Java

/*
Instructions - 

    1. 'shop' is object of class Shop.
    2. User 'shop.get(int i)' to enquire about the price
            of the i^th chocolate.
    3. Every chocolate in shop is arranged in increasing order
            i.e. shop.get(i) <= shop.get(i + 1) for all 0 <= i < n - 1
*/
class Solution{
    
    static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    static long find(int n, long k){
        // Return the number of chocolates Geek had
        // enjoyed out of 'n' chocolates availabe in the
        // 'shop'.
        long count=0;
        int l=0, h=n-1;
        Map<Integer, Long> hm = new HashMap<>();
        while(k>0){
            l=0;
            while(l<=h){
                int mid = l+(h-l)/2;
                long temp;
                if(hm.containsKey(mid)){
                    temp = hm.get(mid);
                }
                else{
                    temp = shop.get(mid);
                    hm.put(mid, temp);
                }
                if(temp<=k){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
                
            }
            if(h==-1){
                break;
            }
            
            count+=k/hm.get(h);
            k=k%hm.get(h);
        }
        return count;
    }

}
