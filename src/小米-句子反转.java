import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] content = in.nextLine().split(" ");

        // for(int i=0;i<content.length/2;i++){
        //     String tmp = content[i];
        //     content[i] = content[content.length-1-i];
        //     content[content.length-1-i] = tmp;
        // }

        for(int i=content.length-1;i>0;i--){//不考虑返回值倒着打印就行
            System.out.print(content[i]+" ");
        }
        System.out.println(content[0]);
    }
}