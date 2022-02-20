/**
 * 给定一张包含N个点、N-1条边的无向连通图，
 * 节点从1到N编号，每条边的长度均为1。
 * 假设你从1号节点出发并打算遍历所有节点，
 * 那么总路程至少是多少？
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

//怎么DFS呢？
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int res;
        int n = in.nextInt();
        int[][] data = new int[n-1][2];
        for(int i=0;i<n-1;i++){
            data[i][0]=in.nextInt();
            data[i][1]=in.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n-1;i++){
            set.add(data[i][0]);
        }
        res = n-1+n-1-set.size();
        System.out.println(res);
    }
}