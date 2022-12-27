
class Solve{
    
    long maxArea(int a[], int len){
        int left=0, right=len-1;
        int area=0;
        while(left<right){
            int currArea=0;
            int minLen = Math.min(a[left], a[right]);
            int wid = (right+1)-(left+1);
            currArea = wid*minLen;
            area = Math.max(area, currArea);
            
            if(a[left]<a[right]){
                left++;
            }
            else{
                right--;
            }
        }
        
        return area;
        
    }
    
}
