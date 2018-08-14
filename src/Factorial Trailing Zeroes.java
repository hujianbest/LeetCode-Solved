class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
        }
        // int count=0;
        // long sum=1;
        // while(n>0){
        //     sum*=n;
        //     n=n-1;
        // }
        // while(sum>=10 && sum%10==0){
        //     count++;
        //     sum=sum/10;
        // }
        // return count;
}