class Solution {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        int len = c.length;
        char temp;
        for(int i=0;i<len/2;i++){
            temp = c[i];
            c[i] = c[len-1-i];
            c[len-1-i] = temp;
        }
        return new String(c);
    }
}