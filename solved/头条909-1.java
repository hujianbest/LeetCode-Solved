import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        char[] c = s.toCharArray();
        Set result = new HashSet();
        int i=0,j=0,max=0;
        while(i<s.length()){
            if(!result.contains(c[i])){
                result.add(c[i]);
                i++;
                max=Math.max(max,result.size());
            }else{
                result.remove(c[j++]);
            }
        }
        System.out.println(max);
    }
}