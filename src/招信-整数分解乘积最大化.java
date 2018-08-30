import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Doit(num));
    }

    //最优化问题，尽量都分成3，不足部分就分成2
    public static long Doit(int num) {
        long result = 1;
        while(num>4){
            result = result*3;
            num=num-3;
        }
        result = result * num;
        return result;
    }
}