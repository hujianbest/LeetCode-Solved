/**
 * 给出一个非空的字符串，判断这个字符串是否是由它的一个子串进行多次首尾拼接构成的。
 * 例如，"abcabcabc"满足条件，因为它是由"abc"首尾拼接而成的，而"abcab"则不满足条件。
 * 
 * LeetCode 459. Repeated Substring Pattern
 * Given a non-empty string check if it can 
 * be constructed by taking a substring of it 
 * and appending multiple copies of the substring 
 * together. You may assume the given string 
 * consists of lowercase English letters only 
 * and its length will not exceed 10000.
 */

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Doit(str));
    }

    //思路：如果是子串的重复，那么整个串必是从头开始的某个子串的m次重复，暴力寻找这个子串
    public static String Doit(String str) {
        int len = str.length();
        for(int i=len/2;i>0;i--){
            if(len%i==0){
                int times = len/i;
                String s = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<times;j++){
                    sb.append(s);
                }
                if(sb.toString().equals(str)){
                    return s;
                }
            }
        }
        return "false";
    }
}