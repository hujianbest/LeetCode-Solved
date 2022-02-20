class Solution {
    public boolean isHappy(int n) {
        int slow,fast;
        slow=fast=n;
        do{
            slow=digitalSquareSum(slow);
            fast=digitalSquareSum(fast);
            fast=digitalSquareSum(fast);
        }while(slow!=fast);
        if(slow==1) return true;
        else return false;
    }
    public int digitalSquareSum(int n){
        int sum=0,temp;
        while(n!=0){
            temp=n%10;
            sum=sum+temp*temp;
            n=n/10;
        }
        return sum;
    }
}