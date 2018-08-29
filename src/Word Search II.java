import java.util.List;
import java.util.ArrayList;

/**
 * Given a 2D board and a list of words from the dictionary, find all words in the board.
 * Each word must be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once in a word.
 */

class Solution {

    TireNode root = new TireNode();

    public List<String> findWords(char[][] board, String[] words) {

        List<String> res = new ArrayList<>();

        if(board==null||board.length==0||board[0].length==0) return res;
        
        BuildTire(words);

        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                DFS(board, root, i, j, res);
            }
        }
        return res;
    }

    

    

    private void BuildTire(String[] words) {
        for(String word : words){
            TireNode node = root;
            for(char c : word.toCharArray()){
                if(node.next[c-'a']==null){
                    node.next[c-'a']=new TireNode();
                }
                node = node.next[c-'a'];
            }
            node.word = word;
        }
        
    }

    private void DFS(char[][] board, TireNode node, int x, int y, List res) {
        char c = board[x][y];
        if(x<0||x>=board.length||y<0||y>=board[0].length||board[x][y]=='#') return;
        if(node.next[board[x][y]-'a']==null) return;
        node = node.next[board[x][y]-'a'];
        if(node.word!=null) {
            res.add(node.word);
            node.word = null;
        }

        board[x][y] = '#';//在一个DFS里面一个点不能被重用
        if (x > 0) DFS(board, node, x - 1, y, res); 
        if (y > 0) DFS(board, node, x, y - 1, res);
        if (x < board.length - 1) DFS(board, node, x + 1, y, res); 
        if (y < board[0].length - 1) DFS(board, node, x, y + 1, res); 
        board[x][y] = c;//不同的DFS里面可以被重用

    }
}

class TireNode{
    TireNode[] next = new TireNode[26];
    String word;
}