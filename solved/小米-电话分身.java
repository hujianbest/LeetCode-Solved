
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Scanner;

// public class Main{

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         int n = in.nextInt();

//         String[] strs = new String[n];

//         for(int i=0;i<n;i++){
//             strs[i] = in.nextLine();
//             System.out.println(minusString(strs[i]));
//         }


//     }

//     public static String minusString(String str) {
//         List<Integer> num = new ArrayList<>();
//         String[] UpCase = {
//             "ZERO","ONE","TWO","THREE","FOUR",
//             "FIVE","SIX","SEVEN","EIGHT","NINE"
//         };
//         for(int i=0;i<10;i++){
//             if(str.matches("^"+UpCase[i])){
//                 num.add(((i+10)-8)%10);
//                 str = str.substring(UpCase[i].length(), str.length());
//             }
//         }

//         Collections.sort(num);

//         return num.toString();
        
        
//     }
// }


import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        String[] strs = new String[n];

        for(int i=0;i<n;i++){
            strs[i] = in.nextLine();
		}

		for(int i=0;i<n;i++){
            System.out.println(minusString(strs[i]));
		}
		
		
		


    }

    public static String minusString(String str) {
		
		int bucket[] = new int[10];

		Map<Character,Integer> map = new HashMap<>();

		Arrays.fill(bucket, 0);
		char[] cs = str.toCharArray();
		for(char c : cs){
			map.put(c, map.getOrDefault(c, 0)+1);
		}



		bucket[2] = map.getOrDefault('Z',0);
		bucket[4] = map.getOrDefault('W',0);
		bucket[6] = map.getOrDefault('U',0);
		bucket[8] = map.getOrDefault('X',0);
		bucket[0] = map.getOrDefault('G',0);

		bucket[3] = map.getOrDefault('O',0) - bucket[2] - bucket[4] - bucket[6];
		bucket[5] = map.getOrDefault('R',0) - bucket[2] - bucket[6];
		bucket[7] = map.getOrDefault('F',0) - bucket[6];
		bucket[9] = map.getOrDefault('S',0) - bucket[8];
		
		bucket[1] = map.getOrDefault('I',0) - bucket[7] - bucket[8] - bucket[0];

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<10;i++){
			while(bucket[i]>0){
				sb.append(i);
				bucket[i]--;
			}
			
		}

		return sb.toString();
   
    }
}