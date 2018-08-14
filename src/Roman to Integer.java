class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romantoIntMap = new HashMap<>();
        romantoIntMap.put('I',1);
        romantoIntMap.put('V',5);
        romantoIntMap.put('X',10);
        romantoIntMap.put('L',50);
        romantoIntMap.put('C',100);
        romantoIntMap.put('D',500);
        romantoIntMap.put('M',1000);
        int result = 0;
        result = result + romantoIntMap.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(romantoIntMap.get(s.charAt(i)) <= romantoIntMap.get(s.charAt(i-1)))
                result = result + romantoIntMap.get(s.charAt(i));
            else
                result = result + romantoIntMap.get(s.charAt(i)) - 2*romantoIntMap.get(s.charAt(i-1));               
        }
        return result;
        
        /////////////////////////////////////////////////////
        
//         int result = 0;
//         result = result + myvalueof(s.charAt(0));
//         for(int i=1;i<s.length();i++){
//             if(myvalueof(s.charAt(i)) <= myvalueof(s.charAt(i-1)))
//                 result = result + myvalueof(s.charAt(i));
//             else
//                 result = result + myvalueof(s.charAt(i)) - 2*myvalueof(s.charAt(i));               
//         }
//         return result;
        
//     }
//     public int myvalueof(char c){
//         int result = 0;
//         switch(c){
//             case 'I':
//                 result = 1;
//                 break;
//             case 'V':
//                 result = 5;
//                 break;
//             case 'X':
//                 result = 10;
//                 break;
//             case 'L':
//                 result = 50;
//                 break;
//             case 'C':
//                 result = 100;
//                 break;
//             case 'D':
//                 result = 500;
//                 break;
//             case 'M':
//                 result = 1000;
//                 break;
//             default:
//                 System.out.println("Invalid Roman Number");
//                 break;      
//         }
//         return result;
    }
}