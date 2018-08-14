import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        str = str.toLowerCase();
        str = str.replace(" ", "");
        System.out.println(str);
        int[] bucket = new int[26];
        Arrays.fill(bucket, 0);

        char[] cs = str.toCharArray();
        for(char c : cs){
            bucket[c-'a']++;
            if(bucket[c-'a']==3){
                System.out.println(c);
                break;
            }
        }
    }

    
}