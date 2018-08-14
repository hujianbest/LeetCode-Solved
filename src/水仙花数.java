import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
		int n = in.nextInt();
		List<Integer> result = new ArrayList<>();

        for(int i=m;i<=n;i++){
            int sum = 0;
            int num = i;
            while(num>0){
                sum+=(num%10)*(num%10)*(num%10);
                num=num/10;
            }
            if(sum == i){
                result.add(i);
            }
        }

        if(result.size() == 0){
            System.out.println("no");
        }else{
			for(int i=0;i<result.size()-1;i++){
				System.out.print(result.get(i)+" ");
			}
			System.out.println(result.get(result.size()-1));
		}
    }
}
