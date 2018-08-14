import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] dp =new int[n];
        dp[0] = 0;
        int[] history = new int[n];
        history[0] = 1;
        Arrays.fill(history, 0);


        for(int i=1;i<n;i++){
            int root = in.nextInt();
            int self = in.nextInt();
            history[self]++;
            if(history[root]>0){
                dp[i] = dp[i-1] + 1;
                history[root]--;
            }else{
                dp[i] = dp[i-1];
            }
        }

        System.out.println(dp[n-1]);

    }
}