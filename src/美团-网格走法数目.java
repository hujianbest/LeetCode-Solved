import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        int[][] dp = new int[x+1][y+1];

        Arrays.fill(dp[0], 1);
        for(int i=0;i<=x;i++){
            dp[i][0] = 0;
        }

        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        System.out.println(dp[x][y]);
    }
}