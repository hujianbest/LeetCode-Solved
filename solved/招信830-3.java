import java.util.Scanner;

//思路：
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] strs = str.split(" ");
        int[] data = new int[strs.length];
        for(int i=0;i<data.length;i++){
            data[i] = Integer.parseInt(strs[i]);
        }

        String str0 = in.nextLine();
        int h = Integer.parseInt(str0);

        int k = 1;
        while(howManyHours(data, k)>h){
            k++;
        }
        System.out.println(k);


    }

    public static int howManyHours(int[] data, int k) {
        int count = 0;
        for(int n : data){
            count=count+n/(k+1)+1;
        }
        return count;
    }
}