/**
 * 小明拿到了一个数列a1 , a2 , ... an ，
 * 小明想知道存在多少个区间[l,r]同时满足下列两个条件：
 * 1、r-l+1=k;
 * 2、在a l , a l+1,...ar中，存在一个数至少出现了 t 次。
 * 输出满足条件的区间个数。
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//暴力
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int t = in.nextInt();

        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i] = in.nextInt();
        }
        int res = 0;
        for(int i=0;i<n-k;i++){
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=0;j<k;j++){
                map.put(data[i+j], map.getOrDefault(data[i+j], 0)+1);
                if(map.get(data[i+j])>=t){
                    res++;
                    break;
                }
            }
        }

        System.out.println(res);
    }
}