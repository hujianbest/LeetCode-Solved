import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] data = new int[7];
        data[0]=0;
        for(int i=1;i<7;i++){
            data[i]=in.nextInt();
        }

        int count = 0;
        count+=data[6]+data[5]+data[4]+(data[3]+3)/4;
        int left22 = data[4]*5;
        if(data[3]%4==3){
            left22+=1;
        }else if(data[3]%4==2){
            left22+=3;
        }else if(data[3]%4==1){
            left22+=5;
        }
        if(left22<data[2]){
            count+=(((data[2]-left22)+8)/9);
        }

        

        int left11 = 36*count - 36*data[6] - 25*data[5]-16*data[4] - 9*data[3] - 4*data[2];
        if(left11 < data[1]){
            count+=(((data[1]-left11)+35)/36);
        }
        System.out.println(count);
    }
}