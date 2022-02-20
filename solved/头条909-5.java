import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] data = new int[m][2];
        for(int i=0;i<m;i++){
            data[i][0] = in.nextInt();
            data[i][1] = in.nextInt();
        }

        List<Set<Integer>> dp = new ArrayList<>();

        for(int i=0;i<m;i++){
            dp.add(new HashSet<>());
        }
        for(int i=0;i<m;i++){
            dp.get(data[i][1]-1).add(data[i][1]-1);
            dp.get(data[i][1]-1).add(data[i][0]-1);
        }

        boolean flag = true;
        while(flag){
            flag=false;
            for(int i=0;i<m;i++){
                if(dp.get(data[i][1]-1).addAll(dp.get(data[i][0]-1))){
                    flag = true;
                }
            }
        }

        int count = 0;
        for(Set set : dp){
            if(set.size()==n){
                count++;
            }
        }

        System.out.println(count);
        
    }
}