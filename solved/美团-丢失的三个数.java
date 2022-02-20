import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte[] bucket = new byte[10001];

        byte zero = 0;

        Arrays.fill(bucket, zero);

        while(in.hasNext()){
            bucket[in.nextInt()]=1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<10001;i++){
            if(bucket[i]==0){
                sb.append(i);
            }
        }

        long result = Long.parseLong(sb.toString())%7;

        System.out.println(result);
    }
}