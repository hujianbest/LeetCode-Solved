import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//BFS保证最短
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x0 = in.nextInt();
        int y0 = in.nextInt();

        int xEnd = in.nextInt();
        int yEnd = in.nextInt();

        int[][] map = new int[9][9];
        int[][] data = new int[9][9];

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                map[i][j] = 0;
                data[i][j] = Integer.MAX_VALUE;
            }
        }

        map[x0][y0] = 1;
        data[x0][y0] = 0;

        int[][] dir = {{-2,-1},{-2,1},{-1,-2},{-1,2},{1,-2},{1,2},{2,-1},{2,1}};

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x0,y0));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            for(int i=0;i<8;i++){
                Node nextNode = node.goK(dir, i);
                if(nextNode.isLeagle(map)){
                    map[nextNode.x][nextNode.y] = 1;
                    data[nextNode.x][nextNode.y] = data[node.x][node.y]+1;
                    if(nextNode.x==xEnd&&nextNode.y==yEnd) {
                    	System.out.println(data[xEnd][yEnd]);
                    	return;
                    }
                    queue.add(nextNode);
                }
            }
        }
		System.out.println(data[xEnd][yEnd]);

        

        
    }
}

class Node{
    int x;
    int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Node goK(int[][] dir, int k){
        return new Node(this.x+dir[k][0],this.y+dir[k][1]);
    }

    public boolean isLeagle(int[][] map){
        if(x>0&&y>0&&x<9&&y<9&&map[x][y]==0) return true;
        return false;
    }
}