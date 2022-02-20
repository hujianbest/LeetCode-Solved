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

        System.out.println(solve(map));


    }


    public static int solve(int[][] map) {
        if(map.length == 0 || map[0].length == 0) return 0;
        int m = map.length, n = map[0].length;
        UF uf = new UF(m , n, map);
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(map[i][j] == 0) continue;
                int p = i * n + j;
                int q;
                if(i > 0 && map[i - 1][j] == 1) {
                    q = p - n;
                    uf.union(p, q);
                }
                if(i < m - 1 && map[i + 1][j] == 1) {
                    q = p + n;
                    uf.union(p, q);
                }
                if(j > 0 && map[i][j - 1] == 1) {
                    q = p - 1;
                    uf.union(p, q);
                }
                if(j < n - 1 && map[i][j + 1] == 1) {
                    q = p + 1;
                    uf.union(p, q);
                }
            }
        }
        return uf.count;
    }
}


class UF {

    public int count = 0;
    public int[] id = null;
    
    public UF(int m, int n, int[][] map) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(map[i][j] == 1) count++;
            }
        }
        id = new int[m * n];
        for(int i = 0; i < m * n; i++) {
            id[i] = i;
        }
    }
    
    public int find(int p) {
        while(p != id[p]) {
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
    
    public boolean isConnected(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot != qRoot) return false;
        else return true;
    }
    
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;
        id[pRoot] = qRoot;
        count--;
    }
}