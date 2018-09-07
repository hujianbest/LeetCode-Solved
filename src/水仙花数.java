/**
 * “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，
 * 比如：153=1^3+5^3+3^3。 现在要求输出所有在m和n范围内的水仙花数。
 */


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
