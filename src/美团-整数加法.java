import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = in.nextLine().split(" ");

        strs[0] = (new StringBuilder(strs[0])).reverse().toString();
        strs[1] = (new StringBuilder(strs[1])).reverse().toString();

        char[] a = strs[0].toCharArray();
        char[] b = strs[1].toCharArray();

        int pa = 0;
        int pb = 0;
        int jinwei = 0;

        StringBuilder sb = new StringBuilder();

        while(pa<a.length && pb<b.length){
            if(a[pa]<'0'||a[pa]>'9'||b[pb]<'0'||b[pb]>'9'){
                System.out.println("Error");
                return;
            }
            int val = a[pa]-'0'+b[pb]-'0'+jinwei;
            sb.append(val%10);
            jinwei = val/10;
            pa++;
            pb++;
        }

        while(pa<a.length){
            if(a[pa]<'0'||a[pa]>'9'||b[pb]<'0'||b[pb]>'9'){
                System.out.println("Error");
                return;
            }
            int val = a[pa]-'0'+jinwei;
            sb.append(val%10);
            jinwei = val/10;
            pa++;
        }

        while(pb<b.length){
            if(a[pa]<'0'||a[pa]>'9'||b[pb]<'0'||b[pb]>'9'){
                System.out.println("Error");
                return;
            }
            int val = b[pb]-'0'+jinwei;
            sb.append(val%10);
            jinwei = val/10;
            pb++;
        }

        if(jinwei!=0){
            sb.append(jinwei);
        }

        System.out.println(sb.reverse());

    }
}