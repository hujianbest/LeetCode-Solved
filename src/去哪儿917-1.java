import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//简单题
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strs = str.split(" ");
        int[] data = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            data[i] = Integer.parseInt(strs[i]);
        }

        int sum = 0;
        int max = data[0];
        for(int i=0;i<data.length;i++){
            sum=sum+data[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }

        System.out.println(max);
    }
}