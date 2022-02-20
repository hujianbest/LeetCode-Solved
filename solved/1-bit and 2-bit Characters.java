class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        int len=bits.length;
        while(i<len-1){
            if(bits[i]==0)
                i++;
            else
                i+=2;
        }
        return i==len-1;
    }
}