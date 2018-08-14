import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int n = in.nextInt();
        StringBuilder input = new StringBuilder(str);

        while(n>0){
            input = removeOne(input);
            n--;
        }

        System.out.println(input);
    }

    

    public static StringBuilder removeOne(StringBuilder input) {
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)<input.charAt(i+1)){
                input.deleteCharAt(i);
                return input;
            }
        }
        return input.deleteCharAt(input.length()-1);
    }
}