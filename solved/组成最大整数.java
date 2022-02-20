// package 刷题;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// public class Main {

// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub

// 		Scanner in = new Scanner(System.in);

// 		int n = Integer.parseInt(in.nextLine());

// 		String[] strs = new String[n];

// 		strs = in.nextLine().split(" ");

// 		for(int i=strs.length-1;i>=0;i--){
// 			for(int j=strs.length-1;j>strs.length-1-i;j--){
// 				if(isABiggerThanB(strs[j], strs[j-1])){
					
// 					String tmp = strs[j];
// 					strs[j] = strs[j-1];
// 					strs[j-1] = tmp;
					
// 				}
// 			}
// 		}

// 		for(int i=0;i<n;i++){
// 			System.out.print(strs[i]);
// 		}
		
// 	}
	
// 	public static boolean isABiggerThanB(String a, String b) {
// 		int intAB = Integer.parseInt(a+b);
// 		int intBA = Integer.parseInt(b+a);

// 		return intAB>intBA?true:false;
		
// 	}


// }




public class Main{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());

		String[] strs = new String[n];

		strs = in.nextLine().split(" ");

		Arrays.sort(strs, 0, n, new Comparator<String>() {

			@Override
			public int compare(String a, String b){
				return (a+b).compareTo(b+a);
			}
		});

		for(int i=0;i<n;i++){
			System.out.print(strs[i]);
		}
		
	}
}