/**
 * Given a 2d grid map of '1's (land) and '0's (water), 
 * count the number of islands. 
 * An island is surrounded by water and is formed by 
 * connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all surrounded by water.
 */

 /**
  * 看到这题心都碎了，这根头条第一次笔试那个观众组团的问题基本一模一样，
  * 当时也是没做出来.
  * 当时思路是从每一个为1的点开始8个方向DFS,并将到达的点改为2，每从一个1出发计数+1.
  * 还是得多练习啊！
  */



/**
 * DFS AC
 * 47 / 47 test cases passed.
 * Status: Accepted
 * Runtime: 12 ms
 * Submitted: 0 minutes ago
 */  

class Solution {
    public int numIslands(char[][] grid) {

        if(grid==null || grid.length==0) return 0;//注意判空

        //int[][] dir = {{0,-1},{0,1},{-1,0},{1,0},{-1,-1},{1,1},{-1,1},{1,-1}};//8个方向方便循环
        int[][] dir = {{0,-1},{0,1},{-1,0},{1,0}};//4个方向方便循环
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    DFS(grid, new Node(i,j), dir, n, m);
                }
            }
        }
        return count;

    }

    private void DFS(char[][] grid,Node node, int[][] dir, int n, int m){
        grid[node.x][node.y] = '2'; 
        for(int i=0;i<4;i++){
            Node nextNode = node.goK(dir, i);
            if(nextNode.isLeagle(grid,n,m,node)){
                DFS(grid, nextNode, dir, n, m);
            }
            
        }
        return;
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

    public boolean isLeagle(char[][] grid, int n, int m, Node node){
        if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]=='1') return true;
        return false;
    }
}



/**
 * DFS with no Node
 * 47 / 47 test cases passed.
 *  Status: Accepted
 * Runtime: 7 ms
 * Submitted: 0 minutes ago
 */
class Solution1 {

    private int n;
    private int m;

    public int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                if (grid[i][j] == '1') {
                    DFSMarking(grid, i, j);
                    ++count;
                }
        }    
        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j);
        DFSMarking(grid, i - 1, j);
        DFSMarking(grid, i, j + 1);
        DFSMarking(grid, i, j - 1);
    }
}




/**
 * what about use Union Find?
 */

/**
 * UF AC
 * 47 / 47 test cases passed.
 * Status: Accepted
 * Runtime: 15 ms
 * Submitted: 0 minutes ago
 */

 class Solution0 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)  {
            return 0;  
        }
        int[][] distance = {{1,0},{-1,0},{0,1},{0,-1}};
        UnionFind uf = new UnionFind(grid);  
        int rows = grid.length;  
        int cols = grid[0].length;  
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                if (grid[i][j] == '1') {  
                    for (int[] d : distance) {//每一个节点，将它周围4个方向的点往自己身上合并
                        int x = i + d[0];       //会判断合并过没有，其实有重复
                        int y = j + d[1];
                        if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == '1') {  
                            int id1 = i*cols+j;
                            int id2 = x*cols+y;
                            uf.union(id1, id2);  
                        }  
                    }  
                }  
            }  
        }  
        return uf.count;  

    }
}

class UnionFind{
    int[] father;
    int m;
    int n;
    int count = 0;

    UnionFind(char[][] grid){
        m = grid.length;
        n = grid[0].length;
        father = new int[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){//刚开始每个'1'都是独立的
                    int id = i*n+j;
                    father[id] = id;
                    count++;
                }
            }
        }
    }

    //查找，找到该集合的代表元素
    public int find(int node){
        if(father[node]==node){//代表元素
            return node;
        }
        father[node] = find(father[node]);//一直找到根节点
        return father[node];
    }

    //合并
    public void union(int node1, int node2){
        int find1 = find(node1);//找到两个节点所在集合的代表元素
        int find2 = find(node2);
        if(find1 != find2){
            father[find1] = find2;//合并，find2作为find1的新代表元素
            count--;//合并一次集合数量-1
        }
    }
}