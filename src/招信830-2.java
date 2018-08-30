import java.util.Scanner;

//思路：
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] strs = str.split(" ");
        int[] data = new int[strs.length];
        for(int i=0;i<data.length;i++){
            data[i] = Integer.parseInt(strs[i]);
        }

        int max=0;
        int count=0;
        for(int i=0;i<data.length-1;i++){
            count=count+data[i+1]-data[i];
            if(count<0)
                count=0;
            if(count>=0&&count>=max)
                max=count;
        }
        System.out.println(max);

    }
}