import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;
        int times = n-2;
        for(int i=2;i<n;i++){
            sum+=get(n,i);
        }

        int gcd = gcd(sum, times);
        System.out.println(sum/gcd+"/"+times/gcd);
    }

    public static int  get(int n, int x) {
        int count = 0;
        while(n>0){
            count+=(n%x);
            n=n/x;
        }
        return count;
    }

    public static int gcd(int x, int y) {
        if(y == 0)
            return x;
        else
            return gcd(y,x%y);
    }
}