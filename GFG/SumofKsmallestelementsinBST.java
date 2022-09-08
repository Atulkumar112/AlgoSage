/*
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/
// first method 
// class Tree {
//     void help(Node root, List<Integer> list){
//         if(root == null) return ;
//         list.add(root.data);
//         help(root.left, list);
//         help(root.right, list);
        
//     }
//     int sum(Node root, int k) { 
//         int sum = 0;
//         List<Integer> list = new ArrayList<Integer>();
//         if(root == null) return 0;
//         help(root, list);
        
//         Collections.sort(list);
//         for(int i=0; i<k; i++){
//             sum += list.get(i);
//         }
        
//         return sum;
//         // Code here
//     } 
// }

//Second method  it is better 
class Tree {
    int sum;
    int count;
    int sum(Node root, int k) { 
        sum = 0;
        count = 0;
        dfs(root, k);
        return sum;
    }
    
    void dfs(Node root, int k){
        if(root == null) return;
        dfs(root.left, k);
        if(count<k){
            sum += root.data;
            count++;
        }
        if(count<k){
            dfs(root.right, k);
            
        }
    }
}








