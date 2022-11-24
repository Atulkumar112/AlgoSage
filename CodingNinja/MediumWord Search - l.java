import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static boolean present(char[][] board, String word, int n, int m) 
    {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(wordRec(board, i, j, 0, word)) return true;
                }
            }
        }
        return false;
    }
    
    public static boolean wordRec(char[][] b, int n, int m, int pos, String word){
        if(pos == word.length()) return true;
        
        if(n<0 || m<0 || n>=b.length || m>=b[0].length || b[n][m] != word.charAt(pos)){
            return false;
        }
            
        char temp = b[n][m];
        b[n][m] = '#';
        
        boolean op1 = wordRec(b, n+1, m, pos+1, word);
        boolean op2 = wordRec(b, n-1, m, pos+1, word);
        boolean op3 = wordRec(b, n, m+1, pos+1, word);
        boolean op4 = wordRec(b, n, m-1, pos+1, word);
        b[n][m] = temp;
        
        return op1 || op2 || op3 || op4;
    }
}
