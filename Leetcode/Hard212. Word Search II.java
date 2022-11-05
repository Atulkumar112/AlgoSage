// class Solution {
//     // i am doing this question with trie data strcture 
/// below code is showing time limit exceed 
//     public class TrieNode{
//         public boolean isWord = false;
//         public TrieNode[] child = new TrieNode[26];
//         public TrieNode(){

//         }
//     }
//     TrieNode root = new TrieNode();
//     boolean[][] flag;
    
//     public List<String> findWords(char[][] board, String[] words) {
//         Set<String> result = new HashSet<>();
//         flag = new boolean[board.length][board[0].length];
        
//         addToTrie(words);
        
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board[0].length; j++){
//                 if(root.child[board[i][j]  - 'a'] != null){
//                     search(board, i, j, root, "", result);
//                 }
//             }
//         }
        
//         return new LinkedList<>(result);
//     }
    
//     private void addToTrie(String[] words){
//         for(String word: words){
//             TrieNode node = root;
//             for(int i=0; i<word.length(); i++){
//                 char ch = word.charAt(i);
//                 if(node.child[ch-'a'] == null){
//                     node.child[ch-'a'] = new TrieNode();
//                 }
//                 node = node.child[ch-'a'];
//             }
//             node.isWord = true;
//         }
//     }
    
//     private void search(char[][] board, int i, int j, TrieNode node, String word, Set<String> result){
//         if(i>=board.length || i<0 || j>=board[i].length || j<0 || flag[i][j] || node.child[board[i][j]-'a'] == null){
//             return;
//         } 
        
//         flag[i][j] = true;
//         node = node.child[board[i][j]-'a'];
//         if(node.isWord){
//             result.add(word+board[i][j]);
//         }
        
//         search(board, i-1, j, node, word + board[i][j], result);
//         search(board, i+1, j, node, word + board[i][j], result);
//         search(board, i, j-1, node, word + board[i][j], result);
//         search(board, i, j+1, node, word + board[i][j], result);
        
//         flag[i][j] = false;
           
//         }
// }
    
    ///////-

// Solution 2
///// below code is showing time limit exceed 
// class Solution {
//      public List<String> findWords(char[][] board, String[] words) {
//          Set<String> hashSet = new HashSet<>();
//          int n = board.length;
//          int m = board[0].length;
//          if(n==0 || m ==0){
//              return new ArrayList<>();
//          }

//          for(String word: words){

//              for(int i=0;i<n;i++){
//                  for(int j=0;j<m;j++){
//                      boolean[][] visited = new boolean[n][m];
//                      if(word.charAt(0) == board[i][j]){
//                          if(dfs(word, 0, i, j, visited, board)){
//                              hashSet.add(word);
//                          }
//                      }
//                  }
//              }
//          }
//          return new ArrayList<>(hashSet);
//      }

//      private boolean dfs(String word, int len, int i, int j, boolean[][] visited, char[][] board){
//          if(len==word.length()){
//              return true;
//          }
//          if(i<0 || j<0 || i>=board.length || j>=board[0].length || word.charAt(len)!=board[i][j] || visited[i][j]){
//              return false;
//          }
//          boolean res = false;
//          visited[i][j] = true;
//          res = dfs(word, len+1, i-1, j, visited, board) ||
//              dfs(word, len+1, i+1, j, visited, board) ||
//              dfs(word, len+1, i, j+1, visited, board) ||
//              dfs(word, len+1, i, j-1, visited, board);

//          visited[i][j] = false;

//          return res;
//      }
//  }

// Solution 3
class Solution {

    private class TrieNode {
        private TrieNode[] children;
        private String word;
        TrieNode(){
            children = new TrieNode[26];
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        int m= board.length, n = board[0].length;

        // System.out.println(" Value is " + root.children['o' -'c']);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(board,  i, j, root, res);
            }
        }
        return res;
    }

    public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        char c = board[i][j];
        if (c == ';' || p.children[c - 'a'] == null) return;
        p = p.children[c - 'a'];
        if (p.word != null) {   // found one
            res.add(p.word);
            p.word = null;     // de-duplicate
        }

        board[i][j] = ';';
        if (i > 0) dfs(board, i - 1, j ,p, res);
        if (j > 0) dfs(board, i, j - 1, p, res);
        if (i < board.length - 1) dfs(board, i + 1, j, p, res);
        if (j < board[0].length - 1) dfs(board, i, j + 1, p, res);
        board[i][j] = c;
    }


    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode p = root;
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (p.children[i] == null) p.children[i] = new TrieNode();
                p = p.children[i];
            }
            p.word = w;
        }
        return root;
    }

}
