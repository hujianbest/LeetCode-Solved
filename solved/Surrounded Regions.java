import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public void solve(char[][] board) {

        if(board==null || board.length==0) return;//注意判空

        int n = board.length;
        int m = board[0].length;
        
        int[][] dir = {{0,-1},{0,1},{-1,0},{1,0}};
        Queue<Node> queue = new LinkedList<>();



        //从所有的边缘点出发，先找到所有边缘点放队列
        //与边缘点相邻的就是安全的
        for(int i=0;i<n;i++){
            if(board[i][0]== 'O'){
                board[i][0] = '+';
                queue.add(new Node(i,0));
            }
            if(board[i][m-1]== 'O'){
                board[i][m-1] = '+';
                queue.add(new Node(i,m-1));
            }
        }

        for(int i=0;i<m;i++){
            if(board[0][i]== 'O'){
                board[0][i] = '+';
                queue.add(new Node(0,i));
            }
            if(board[n-1][i]== 'O'){
                board[n-1][i] = '+';
                queue.add(new Node(n-1,i));
            }
        }


        while(!queue.isEmpty()){
            Node node = queue.poll();
            for(int i=0;i<4;i++){
                Node nextNode = node.goK(dir, i);
                if(nextNode.isLeagle(board, n, m)){
                    board[nextNode.x][nextNode.y] = '+';
                    queue.add(nextNode);
                }
            }
        }

        //解决剩下的与边缘点不相邻的
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='+'){
                    board[i][j]='O';
                }
            }
        }

        


    }
}

class Node{
    int x;
    int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Node goK(int[][] dir,int k){
        return new Node(this.x+dir[k][0],this.y+dir[k][1]);
    }

    public boolean isLeagle(char[][] board, int n, int m){
        if(x>=0&&y>=0&&x<n&&y<m&&board[x][y]=='O') return true;
        return false;
    }
}

