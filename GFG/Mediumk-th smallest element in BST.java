class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int k) {
        // below is a perfact code because it's not leading extra space
        //below code is based on Moris tree Algorithm which use to travers intree
        // without using recursion 
        Node curr=root;
        int count=0;
        int ans=-1;
        while(curr!=null){
            if(curr.left==null){
                count++;
                if(count==k)return curr.data;
                curr=curr.right;
            }else{
                Node leftSubtree=curr.left;
                while(leftSubtree.right!=null && leftSubtree.right!=curr){
                    leftSubtree=leftSubtree.right;
                }

                if(leftSubtree.right==null){
                    leftSubtree.right=curr;
                    curr=curr.left;
                }else{
                    leftSubtree.right=null;
                    count++;
                    if(count==k)return curr.data;
                    curr=curr.right;
                }
            }
        }
        return ans;
        
        
        
    }
        
        // second method 
    //     //but it is also consuming the extra space
    //     return dfs(root, k, new int[]{0});
    // }
    
    // public int dfs(Node root, int k, int[] count){
    //     if(root==null){
    //         return -1;
    //     }
        
    //     int lefty = dfs(root.left, k, count);
    //     if(lefty!=-1){
    //         return lefty;
    //     }
    //     count[0]++;
    //     if(count[0]==k) return root.data;
    //     return dfs(root.right, k, count);
    // }
    
    
    // first method 
    //     List<Integer> list = new ArrayList<>();
    //     rec(root, list);
        
    //     if(list.size() < k){
    //         return -1;
    //     }
        
    //     return list.get(k-1);
    // }
    
    // public void rec(Node root, List<Integer> list){
    //     if(root==null){
    //         return;
    //     }
        
    //     rec(root.left, list);
    //     list.add(root.data);
    //     rec(root.right, list);
    // }
}
