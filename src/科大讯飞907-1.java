import java.util.Arrays;
import java.util.Scanner;


//AC
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int group = in.nextInt();
        while(group>0){
            int n = in.nextInt();
            int x = in.nextInt();
            int[] data = new int[n];
            for(int i=0;i<n;i++){
                data[i]=in.nextInt();
            }

            doIt(data, x);
            group--;
        }
    }

    public static void doIt(int[] data, int x) {
        int sum = 0;
        for(int i : data){
            sum+=i;
        }
        int xx = x*data.length;
        int count = 0;
        Arrays.sort(data);
        while(sum<xx){
            sum=sum+100-data[count];
            count++;
            
        }
        System.out.println(count);
    }
}