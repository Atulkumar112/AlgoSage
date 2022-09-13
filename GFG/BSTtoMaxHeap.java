class Solution
{
    static List<Integer> arr = new ArrayList<>();
    static int i = 0;
    public static void convertToMaxHeapUtil(Node root)
    {
        //code here
        inorder(root);
        postorder(root);
    }
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        arr.add(root.data);
        inorder(root.right);
        
    }
    
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        root.data = arr.get(i++);
    }
}
