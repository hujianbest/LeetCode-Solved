import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int countLucky = 0;
        for(int i=1;i<=n;i++){
            if(f(i)==g(i)){
                countLucky++;
            }
        }

        System.out.println(countLucky);
    }

    public static int f(int n) {
        int f  = 0;
        while(n>0){
            f = f + n%10;
            n=n/10;
        }
        return f;
    }

    public static int g(int n) {
        int countB = 0;
        while(n>0){
            n = n&(n-1);
            countB++;
        }
        return countB;
    }
}