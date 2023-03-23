
class Solution
{
    static int res;
    public static int maxDifferenceBST(Node root,int target)
    {
        int sum=0;
        Node curr = root;
        
        while(curr!=null){
            if(curr.data>target){
                sum+=curr.data;
                curr = curr.left;
            }
            else if(curr.data<target){
            sum+=curr.data;
                curr = curr.right;
            }
            else{
                
                break;
            }
        }
        
        res=Integer.MIN_VALUE;
        if(curr==null){
            return -1;
        }
        else {
            if(curr.left==null && curr.right==null){
                return sum;
            }
            if(curr.left!=null){
                solve(curr.left, sum, 0);
            }
            if(curr.right!=null){
                solve(curr.right, sum, 0);
            }
        }
        
        return res;
    }
    
    public static void solve(Node curr, int sum, int pathSum){
        if(curr==null) return;
        
        if(curr.left==null && curr.right==null){
            res = Math.max(res, sum-(pathSum+curr.data));
            return;
        }
        
        solve(curr.left, sum, pathSum+curr.data);
        solve(curr.right, sum, pathSum+curr.data);
    }
}
