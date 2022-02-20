import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }

        System.out.println(count);
    }
}