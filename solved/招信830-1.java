import java.util.Scanner;

//思路：
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] cs = str.toCharArray();

        int count = 0;
        for(int i=0;i<cs.length;i++){
            for(int j=1;j<cs.length-i;j++){
                if(cs[j]<cs[j-1]){
                    char tmp = cs[j];
                    cs[j] = cs[j-1];
                    cs[j-1] = tmp;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}