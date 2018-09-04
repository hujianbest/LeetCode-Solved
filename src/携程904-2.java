import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int time = in.nextInt();

        List<Integer> list = new ArrayList<>();
        
        int[][] data = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                data[i][j] = in.nextInt();
            }
            if(data[i][1]<=time && data[i][2]>=time){
                list.add(data[i][0]);
            }
        }

        Collections.sort(list);
        for(int i : list){
            System.out.println(i);
        }



    }

    
}