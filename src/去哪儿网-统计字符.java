import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int[] bucketLower = new int[26];
        int[] bucketUpper = new int[26];
        Arrays.fill(bucketLower, 0);
        Arrays.fill(bucketUpper, 0);

        char[] cs = str.toCharArray();
        for(char c : cs){
            if(c>='a'&&c<='z'){
                bucketLower[c-'a']++;
                if(bucketLower[c-'a']==3){
                    System.out.println(c);
                    break;
                }
            }else if(c>='A'&&c<='Z'){
                bucketUpper[c-'A']++;
                if(bucketUpper[c-'A']==3){
                    System.out.println(c);
                    break;
                }
            }
            
        }
    }

    
}