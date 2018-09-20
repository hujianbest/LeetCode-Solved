import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//AC
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> strData = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        while(true){
            String str = in.nextLine();
            if(str.equals("END")) break;
            strData.add(str);
            String[] strs = str.split("#");
            int n = Integer.parseInt(strs[0]);
            int res = Integer.parseInt(strs[1],n);
            data.add(res);
            map.put(res, map.getOrDefault(res, 0)+1);

        }
        boolean flag = true;
        for(int i : data){
            if(map.get(i)==1){
                flag = false;
                System.out.println(strData.get(data.indexOf(i))); 
            }
        }
        if(flag) System.out.println("None");
    }

    
}