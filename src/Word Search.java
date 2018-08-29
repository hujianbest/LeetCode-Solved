/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        if(board==null||board.length==0||board[0].length==0) return false;

        int m = board.length;
        int n = board[0].length;


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(DFS(board, i, j, word,0)) return true;\
            }
        }

        return false;
    }


    private boolean DFS(char[][] board, int x, int y, String word,int i){
        if(i==word.length()) return true;
        boolean res;
        if(x<0||x>=board.length||y<0||y>=board[0].length||board[x][y]=='#') return false;
        if(board[x][y]!=word.charAt(i)) return false;
        char c = board[x][y];
        board[x][y] = '#';
        res = DFS(board, x - 1, y, word,i+1)
            ||DFS(board, x, y - 1, word,i+1)
            ||DFS(board, x + 1, y, word,i+1)
            ||DFS(board, x, y + 1, word,i+1);
        
            board[x][y] = c;
        return res;
    }
}