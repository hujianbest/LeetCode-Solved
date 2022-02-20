import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] data = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                data[i][j] = in.nextInt();
            }
        }
        int[] hangSum = new int[n];
        int[] lieSum = new int[m];
        Arrays.fill(hangSum, 0);
        Arrays.fill(lieSum, 0);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                hangSum[i]+=data[i][j];
                lieSum[j]+=data[i][j];
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max=Math.max(max, hangSum[i]+lieSum[j]);
            }
        }
        System.out.println(max);
    }
    
}