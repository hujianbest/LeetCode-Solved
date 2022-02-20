class Solution {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int len = c.length;
        int result = 0;
        for(int i=0;i<len;i++){
            result = result*26 + c[i] - 'A' + 1;
        }
        return result;
    }
}