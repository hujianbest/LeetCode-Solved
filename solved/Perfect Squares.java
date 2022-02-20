class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            int j=1;
            int min = Integer.MAX_VALUE;
            while((i-j*j)>=0){
                min=Math.min(dp[i-j*j]+1,min);
                j++;
            }
            dp[i] = min;
        }
        
        return dp[n];
    }
    
}