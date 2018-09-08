import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<List<Integer>> res = new ArrayList<>();

        for(int i=n/2;i>=2;i--){

            if(((n-(i*(i-1)/2))%i)==0&&((n-(i*(i+1)/2))/i)>0){
                int num = (n-(i*(i-1)/2))/i;
                List<Integer> list = new ArrayList<>();
                for(int k=0;k<i;k++){
                    list.add(num+k);
                }
                res.add(list);
            }
        }

        for(List<Integer> list : res){
            System.out.println(list.toString());
        }
    }
}