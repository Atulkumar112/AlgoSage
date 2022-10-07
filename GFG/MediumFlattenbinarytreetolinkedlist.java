class Solution
{
    public static void flatten(Node root)
    {
       Node curr = root;
       while(curr!=null){
           if(curr.left != null){
               Node pre = curr.left;
               while(pre.right != null){
                   pre = pre.right;
               }
               pre.right = curr.right;
               curr.right = curr.left;
               curr.left = null;
           }
        curr = curr.right;   
       }
        
    }
}
