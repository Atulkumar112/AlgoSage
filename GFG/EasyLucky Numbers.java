class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        return rec(n, 2);
    }
    
    public static boolean rec(int n, int k){
        if(n%k == 0) return false;
        
        if(n<k) return true;
        
        return rec(n-(n/k), k+1);
    }
}
