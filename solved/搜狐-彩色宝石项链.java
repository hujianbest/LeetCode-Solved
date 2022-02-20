import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char[] cs = str.toCharArray();
        int[] input = new int[2*cs.length];
        Arrays.fill(input,0);
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<cs.length;i++){
            if(cs[i]-'A'<5){
                input[i] = 1<<(cs[i]-'A');
                input[i+cs.length] = 1<<(cs[i]-'A');
            }
        }
        
        for(int i=0;i<input.length;i++){
            for(int j=i+5;j<input.length;j++){
                if(getMin(i,j,input)){
                    min = Math.min(min,j-i);
                    break;
                }
            }
        }

        System.out.println(cs.length-min);
        
    }
    
    public static boolean getMin(int start, int end, int[] input){
        int count = 0;
        for(int i=start;i<end;i++){
            count = count|input[i];
        }
        return count == 31 ? true : false;
    }
}