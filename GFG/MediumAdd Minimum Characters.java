
class Solution
{
	 public static boolean fun(String str,int n){
        int i = 0;
        int j = n;
        while(i<j && str.charAt(i)==str.charAt(j)){
            i++;
            j--;
        }
        if(i<j)
            return false;
        return true;
    }
    
    public static int addMinChar(String str){
        //code here
        int n = str.length()-1;
        while(n>=0 && !fun(str,n))
            n--;
        int ans = str.length()-n-1;
        return ans;
            
    }
}
