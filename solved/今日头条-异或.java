import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] data = new int[n];

        for(int i=0;i<n;i++){
            data[i] = in.nextInt();
        }

        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((data[i]^data[j])>m) count++;
            }
        }

        System.out.println(count);
        }
}

//暴力超时
