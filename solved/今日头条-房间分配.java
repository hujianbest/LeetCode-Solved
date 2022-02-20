import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int houseAmount = in.nextInt();
        int lastNum = in.nextInt()-1;

        int[] house = new int[houseAmount];

        for(int i=0;i<houseAmount;i++){
            house[i] = in.nextInt();
        }

        int min = Integer.MAX_VALUE;
        
        List<Integer> location = new ArrayList<>();

        for(int i=0;i<houseAmount;i++){
            if(house[i]<min){
                min = house[i];
            }
        }

        for(int i=0;i<houseAmount;i++){
            if(house[i]==min){
               location.add(i);
            }
        }

        int finalLocation = 0;

        int count = 0;
        for(int j=0;j<location.size();j++){
            count = 0;
            int[] houseCopy = Arrays.copyOf(house,houseAmount);
            while(houseCopy[location.get(j)]>=0){
                houseCopy[lastNum]--;
                count++;
                lastNum--;
                if(lastNum<0) lastNum = houseAmount-1;
            }
            boolean flag = false;
            for(int k=0;k<houseAmount;k++){
                if(houseCopy[k]<0) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                finalLocation = location.get(j);
                houseCopy[finalLocation] = houseCopy[finalLocation] + count;
                for(int i=0;i<houseAmount-1;i++){
                    System.out.print(houseCopy[i]+" ");
                }
                System.out.println(houseCopy[houseAmount-1]);
                break;
            }
        }

    }
}
