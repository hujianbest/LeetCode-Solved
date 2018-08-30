import java.util.Scanner;

//思路：
public class Main{

    public static void main(String[] args) {
        int res = 0;
        Scanner in = new Scanner(System.in);
        int hp = in.nextInt();
        int na = in.nextInt();
        int ba = in.nextInt();


        if(hp<=na){
            res =1;
        }else if(hp<=ba){
            res = 2;
        }else if(ba<=2*na){
            res = (hp-1)/na+1;
        }else{
            while(hp>ba){
                res = res +2;
                hp = hp-ba;
            }
            if(hp<na){
                res++;
            }else{
                res = res +2;
            }
        }

        System.out.println(res);
    }
}