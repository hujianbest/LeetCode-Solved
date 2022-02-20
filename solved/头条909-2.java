import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int[][] map = new int[m][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                map[i][j] = in.nextInt();
            }
        }


        int[][] dir = {{0,-1},{0,1},{-1,0},{1,0}};//4个方向方便循环

        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==1){
                    count++;
                    DFS(map, new Node(i,j), dir, m);
                }
            }
        }
        System.out.println(count);



        
    }

    private static void DFS(int[][] map,Node node, int[][] dir, int m){
        map[node.x][node.y] = 2; 
        for(int i=0;i<4;i++){
            Node nextNode = node.goK(dir, i);
            if(nextNode.isLeagle(map,m)){
                DFS(map, nextNode, dir, m);
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

    public boolean isLeagle(int[][] map, int m){
        if(x>=0&&y>=0&&x<m&&y<m&&map[x][y]==1) return true;
        return false;
    }
}