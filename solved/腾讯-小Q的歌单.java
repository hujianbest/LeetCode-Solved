import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = in.nextInt();
        int x = in.nextInt();
        int b = in.nextInt();
        int y = in.nextInt();

        int n ;
        n = Math.max(a, b);
        long count = 0;

        long[][] cn = new long[n+1][n+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                cn[i][j] = 0;
            }
        }
        for(int i=0;i<=n;i++){
            cn[i][0] = i;
            cn[i][i] = 1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                cn[i][j] = (cn[i-1][j-1] + cn[i-1][j])%1000000007;
            }
        }

        for(int i=0;i<=a;i++){
            int left = k-(i*x);
            if(left%y==0){
                count+=cn[a][i]*cn[b][left/y]%1000000007;
                count%=1000000007;
            }
        }

        System.out.println(count);





    }
}