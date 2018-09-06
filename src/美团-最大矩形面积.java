import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i] = in.nextInt();
        }

        
        int maxS = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
        	int minVal = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){           	
                minVal = Math.min(minVal, data[j]);
                int s = minVal*(j-i+1);
                maxS = Math.max(maxS, s);
            }
        }

        System.out.println(maxS);

    }
}