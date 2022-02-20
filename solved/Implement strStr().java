class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle == null || needle.length()==0 || haystack.equals(needle))  
            return 0;  
        if(needle.length()>haystack.length())  
            return -1;
        for(int i=0;i<=(haystack.length()-needle.length());i++){
           if(needle.equals(haystack.substring(i,i+needle.length())))
                return i; 
        }  
        return -1;
    }
}