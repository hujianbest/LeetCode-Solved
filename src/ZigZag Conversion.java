class Solution {
    public String convert(String s, int numRows) {
        String result="";
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sbuf = new StringBuffer[numRows];
        for(int i=0;i<numRows;i++)
            sbuf[i] = new StringBuffer();
        int i=0;
        while(i<len){
            for(int index = 0;index<numRows && i<len;index++)
                sbuf[index].append(c[i++]);
            for(int index = numRows-2;index>0 && i<len;index--)
                sbuf[index].append(c[i++]);
        }
        for(int j=0;j<numRows;j++)
            result = result+sbuf[j];
        return result;
    }
}