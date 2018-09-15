import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char[] cs = str.toCharArray();
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i=1;i<cs.length;i++){
            if(cs[i]==cs[i-1]) count++;
            else{
                list.add(count);
                count = 1;
            }
        }
        int max = 0;
        int index = 0;
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i)<list.get(i-1)&&list.get(i)<list.get(i+1));
            if(max<Math.min(list.get(i-1),list.get(i+1))) {
                index = i;
                max = Math.min(list.get(i-1),list.get(i+1));
            }
        }

        int sum = 0;
        for(int i=0;i<index;i++){
            sum+=list.get(i);
        }
        String res= "";
        for(int i=sum-max;i<sum+max+list.get(index);i++){
            res+=cs[i];
        }

        System.out.println(res);
    }
}