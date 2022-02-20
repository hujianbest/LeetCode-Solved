import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[][] data = new int[n][3];

        for(int i=0;i<n;i++){
            data[i][0] = in.nextInt();
            data[i][1] = in.nextInt();
            data[i][2] = in.nextInt();
        }

        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(data[i][0]<data[j][0]&&
                    data[i][1]<data[j][1]&&
                    data[i][2]<data[j][2]){
                        count++;
                    	break;
                    }
            }
        }

        System.out.println(count);
    }
}