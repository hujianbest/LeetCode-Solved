import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t>0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            tryIt(a,b,c);
            
            
            
            t--;
        }
    }

    public static void tryIt(int a, int b, int c) {
        if(a%b==0&&c!=0){
            System.out.println("NO");
            return;
        }
        if(c==0){
            System.out.println("YES");
            return;
        }
        
        for(int i=1;i<b;i++){
            if(a*i%b==c){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        return;
    }
}