import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();
        
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();

        int[][] dp = new int[a.length()+1][b.length()+1];

        int max = Integer.MIN_VALUE;
        for(int i=0;i<=a.length();i++){
            for(int j=0;j<=b.length();j++){
                dp[i][j] = 0;
            }
        }

        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                if(ca[i-1]==cb[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }

        System.out.println(max==Integer.MIN_VALUE?0:max);

    }
}
