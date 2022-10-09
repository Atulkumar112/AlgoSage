//find the nearest prime number of given n and then differece between 
//prime number and givne n.
class Solution
{
    public int NthTerm(int n)
    {
        int gap=1;
        if(isPrime(n)){
            return 0;
        }
        while(true){
            if(isPrime(n+gap) || isPrime(n-gap)){
                break;
            }
            gap++;
        }
        return gap;
    }
    
    //method for check the prime nuber
    public boolean isPrime(int val){
        if(val<2) return false;
        
        for(int i=2; i<=Math.sqrt(val); i++){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }
}
