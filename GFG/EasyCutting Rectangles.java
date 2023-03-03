
class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        List<Long> list = new ArrayList<>();
        
        long len = gcd(L, B);
        long sq = (L*B) / (len*len);
        
        list.add(sq);
        list.add(len);
        
        return list;
    }
    
    
    // TC is O(log min(L, B));
    static long gcd(long a, long b){
        if(b<=0) return a;
        return gcd(b, a%b);
    }
}
