import java.util.Arrays;
import java.util.Scanner;

//思路：
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        String[] strs = new String[n];
        char[][] css = new char[3][4];
        for(int i=0;i<n;i++){
            strs[i] = in.nextLine();
            css[i] = strs[i].toCharArray();
        }

        char[][] cssv = new char[4][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cssv[j][i]=css[i][j];
            }
        }

        for(int i=0;i<m;i++){
            Arrays.sort(cssv[i]);
        }

        String s = "";
        for(int i=0;i<m;i++){
            s+=cssv[i][0];
        }

        System.out.println(s);
    }
}