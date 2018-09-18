import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static String GetResult(int N) {
        int i = 1;
        int[] data = new int[N];
        Arrays.fill(data, 0);
		for(;i<N;i++){
            data[i]=data[i-1]+i;
            if(data[i]>=N) break;
        }
        //i--;
        int a = i;
        int b = 1;
        for(int j=0;j<data[i]-N;j++){
            a--;
            b++;
        }
        if(i%2==0){
            return a+"/"+b;
        }else{
            return b+"/"+a;
        }

    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
            
        int _N;
        _N = Integer.parseInt(in.nextLine().trim());
  
        res = GetResult(_N);
        System.out.println(res);
    }
}
