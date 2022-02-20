import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> list = new ArrayList<>();
        DFS(0, 0, n, "", list);

        for(int i=0;i<list.size()-1;i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println(list.get(list.size()-1));
    }

    public static void DFS(int num1, int num2, int n, String str, List<String> list) {
        if(num1==n && num1+num2==2*n) list.add(str);
        if(num1<n && num1>=num2 && num1+num2<2*n) DFS(num1+1, num2, n, str+'(', list);
        if(num2<n && num1+num2<2*n) DFS(num1, num2+1, n, str+')', list);
        return;
        
    }
}