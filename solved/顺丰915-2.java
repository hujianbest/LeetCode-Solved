import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int max = Integer.parseInt(in.nextLine());

        String[] strs = str.split(",");
        for(int i=0;i<strs.length;i++){
            for(int j=strs[i].length();j<max;j++){
                strs[i]+=" ";
            }
            System.out.println(strs[i]);
        }
    }
}