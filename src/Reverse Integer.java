class Solution {
    public int reverse(int x) {
        boolean negative = x<0;
        long r = 0;
        if(negative) x=-x;
        while(x>0){
            r = r*10 + x % 10;
            x = x/10;
        }
        if(negative) r=-r;
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE) return 0;
        return (int)r;
    }
}