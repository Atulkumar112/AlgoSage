//MOST important questions in a easy list
//The best solution is based on linear approach which is given below 
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        
        int low = 0 , mid = 0 , high = n-1;
        
        while(mid <= high)
        {
            
            if(a[mid] == 0){
                
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                
                mid++;
                low++;
            }
            
            else if(a[mid] == 1){
                
                mid++;
            }
            
            else{
                
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                
                high--;
            }
        }
    }
}

//--------------------------------------------------------------
//below solution is fine and passing all test cases but if you do this same code as in front of the interview he will instantly 
//reject you 
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.print("");
        }
    }
}
