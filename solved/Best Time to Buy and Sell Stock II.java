class Solution {
    public int maxProfit(int[] prices) {
        int count=0;
        int sum=0;
        for(int i=0;i<prices.length-1;i++){
            count=prices[i+1]-prices[i];
            if(count<0)
                count=0;
            sum=sum+count;
        }
        return sum;
    }
}