class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int count=0;
        for(int i=0;i<prices.length-1;i++){
            count=count+prices[i+1]-prices[i];
            if(count<0)
                count=0;
            if(count>=0&&count>=max)
                max=count;
        }
        return max;
    }
}