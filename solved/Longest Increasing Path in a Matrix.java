/**
 * Given an integer matrix, find the length of the longest increasing path.
 * From each cell, you can either move to four directions: left, right, up or down. 
 * You may NOT move diagonally or move outside of the boundary 
 * (i.e. wrap-around is not allowed).
 */


import java.util.Arrays;

class Solution {
    public int longestIncreasingPath(int[][] matrix) {

        if(matrix==null || matrix.length==0) return 0;//注意判空

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] vis = new int[n][m];//刚开始没加这个，超时了，因为遍历了每个节点，存在大量重复计算
        for(int i=0;i<n;i++){
            Arrays.fill(vis[i], 0);
        }
        
        int[][] dir = {{0,-1},{0,1},{-1,0},{1,0}};//四个方向方便循环

        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(vis[i][j]!=0){//加判断，如果这个点遍历过了，就取当前存的最长值
                    max = Math.max(max, vis[i][j]);
                }else{
                    max = Math.max(max, DFS(matrix,new Node(i, j),dir,n,m,vis))  ;
                }
               
                
                
            }
        }

        return max;
        
        
    }

    public static int DFS(int[][] matrix, Node node, int[][] dir, int n, int m,int[][] vis) {
        int max = 0;
        for(int i=0;i<4;i++){
            Node nextNode = node.goK(dir, i);
            if(nextNode.isLeagle(matrix,n,m,node)){
                if(vis[nextNode.x][nextNode.y]!=0){//加判断，如果这个点遍历过了，就取当前存的最长值
                    max = Math.max(max, vis[nextNode.x][nextNode.y]);
                }else{
                    max = Math.max(max, DFS(matrix, nextNode, dir, n, m,vis));
                }
                   
            }
            
        }
        vis[node.x][node.y] = 1+max;//把最长值放进去，每次递归中存一个，下次直接取
        return 1+max;
    }

    
}

class Node{//主要是为了解决四个方向，并判断是不是可行路径问题
    int x;
    int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Node goK(int[][] dir,int k){
        return new Node(this.x+dir[k][0],this.y+dir[k][1]);
    }

    public boolean isLeagle(int[][] matrix, int n, int m, Node node){
        if(x>=0&&y>=0&&x<n&&y<m&&matrix[x][y]>matrix[node.x][node.y]) return true;
        return false;
    }
}