import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double c = in.nextDouble();

        Set<Double> set = new HashSet<>();
        boolean flag = true;
        double k=0;
        while(flag){
            int size = set.size();
            set.add(doIt(x,c,k));
            if(size==set.size()){
                flag = false;
            }
            k=k+1;
        }
        System.out.println(set.size());

    }

    public static double doIt(double x, double c, double k) {
        return Math.pow(x, k)%c;

    }
}
