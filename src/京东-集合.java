import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * 运行时间：476ms
 * 占用内存：28348k
 */
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i] = in.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        for(int i: b){
            set.add(i);
        }

        Integer[] res = set.toArray(new Integer[set.size()]);

        Arrays.sort(res);
        for(int i=0;i<res.length-1;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println(res[res.length-1]);
    }
}


/**
 * 运行时间：526ms
 * 占用内存：27476k
 */
class Main0{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int total = m+n;
        Set<Integer> set = new HashSet<>();
        while(total>0){
            set.add(in.nextInt());
            total--;
        }
        Integer[] res = set.toArray(new Integer[set.size()]);
        Arrays.sort(res);
        for(int i=0;i<res.length-1;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println(res[res.length-1]);
    }
}
