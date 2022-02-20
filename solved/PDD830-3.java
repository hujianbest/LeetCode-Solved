import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int length = 0;
        int location = 0;
        int location0 = 0;

        a= a%b;
        if(a==0){
            System.out.println(0 +" "+0);
            return;
        }
        List<Integer> count = new ArrayList<>();

        while(true){
            count.add(a);
            a*=10;
            a=a%b;
            location0++;
            if(a==0){
                length = 0;
                location = location0;
                break;
            }
            if(count.indexOf(a)>=0){
                location = count.indexOf(a);
                length = count.size()-count.indexOf(a);
                break;
            }
        }

        System.out.println(location +" "+length);

    }
}