import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i] = in.nextInt();
        }

        System.out.println(isOK(data)?1:0);

    }

    public static boolean isOK(int[] data) {
        if(data==null || data.length==0) return false;
        boolean result = true;
        for(int i=0;i<data.length;i++) {
            if(data[i]>255) return false;
            int count = 0;
            if((data[i] & 128) == 0) {
                count = 1;
            } else if((data[i] & 224) == 192) {
                count = 2;
            } else if((data[i] & 240) == 224) {
                count = 3;
            } else if((data[i] & 248) == 240) {
                count = 4;
            } else {
                return false;
            }
            for(int j=1;j<count;j++) {
                if(i+j>=data.length) return false;
                if((data[i+j] & 192) != 128) return false;
            }
            i=i+count-1;
        }
        return result;
    }
}