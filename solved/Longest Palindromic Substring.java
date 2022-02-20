class Solution {
    public String longestPalindrome(String s) {
        char[] c=s.toCharArray();
        int lengthMax=0;
        int start=0;
        
        for(int i=0;i<s.length();i++){
            int j=i-1;
            int k=i+1;
            while(j>=0&&k<s.length()&&c[j]==c[k]){
                if(k-j+1>lengthMax){
                    lengthMax=k-j+1;
                    start=j;
                }
                j--;
                k++;
            }
        }
        for(int i=0;i<s.length();i++){
            int j=i;
            int k=i+1;
            while(j>=0&&k<s.length()&&c[j]==c[k]){
                if(k-j+1>lengthMax){
                    lengthMax=k-j+1;
                    start=j;
                }
                j--;
                k++;
            }
        }
        if(lengthMax>0)
            return s.substring(start,start+lengthMax);
        else 
            return s.substring(0,1);
    }
}