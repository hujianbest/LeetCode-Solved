import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//AC
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        int count = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            int i=list.size()-1;
            while(i>0){
                if(list.get(i)<list.get(i-1)){
                    list.remove(i);
                    flag = true;
                }
                i--;
            }
            count++;
        }

        System.out.println(count);
    }
}