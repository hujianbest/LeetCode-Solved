import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n<=6){
            System.out.println((int)Math.pow(2, n-1));
            return;
        }

        long[] dp = new long[n+1];
        Arrays.fill(dp, 0);
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        dp[4]=8;
        dp[5]=16;
        dp[6]=32;
        for(int i=7;i<=n;i++){
            for(int j=1;j<=6;j++){
                dp[i]+=dp[i-j];
            }
        }

        System.out.println(dp[n]);
    }
}